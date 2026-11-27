// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class mh1 extends View {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Path e;
    public final Path f;
    public boolean h;
    public boolean n;
    public final v41 r;
    public boolean s;
    public final mm w;
    public final /* synthetic */ nh1 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mh1(nh1 nh1Var, Activity activity) {
        super(activity);
        this.x = nh1Var;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Path();
        this.f = new Path();
        this.r = new v41(this);
        this.w = new mm(this, 0L, 320L, k43.h);
        paint.setStyle(Paint.Style.STROKE);
    }

    public final void a(kc7 kc7Var) {
        vnb vnbVar = this.x.a;
        boolean a = vnbVar != null ? vnbVar.a() : aob.I.o();
        Paint paint = this.c;
        Paint paint2 = this.b;
        if (a && kc7Var.g() != kc7Var.f() && kc7Var.i() == kc7Var.f()) {
            paint2.setColor(kc7Var.e(1, vnbVar));
            paint.setColor(kc7Var.e(0, vnbVar));
        } else {
            paint2.setColor(kc7Var.e(0, vnbVar));
            paint.setColor(kc7Var.e(1, vnbVar));
        }
        this.d.setColor(kc7Var.e(2, vnbVar));
        this.h = kc7Var.g() != kc7Var.f();
        this.n = kc7Var.i() != kc7Var.f();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float a = this.r.a(0.05f);
        canvas.scale(a, a, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        canvas.save();
        canvas.clipPath(this.e);
        canvas.drawPaint(this.b);
        if (this.h) {
            canvas.drawPath(this.f, this.c);
        }
        canvas.restore();
        if (this.n) {
            canvas.save();
            RectF rectF = hl.P;
            rectF.set((getMeasuredWidth() - hl.L(12.4f)) / 2.0f, (getMeasuredHeight() - hl.L(12.4f)) / 2.0f, (hl.L(12.4f) + getMeasuredWidth()) / 2.0f, (hl.L(12.4f) + getMeasuredHeight()) / 2.0f);
            canvas.rotate(45.0f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            canvas.drawRoundRect(rectF, hl.L(2.33f), hl.L(2.33f), this.d);
            canvas.restore();
        }
        float d = this.w.d(this.s);
        if (d > 0.0f) {
            float N = hl.N(2.0f);
            Paint paint = this.a;
            paint.setStrokeWidth(N);
            canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, hl.R1((paint.getStrokeWidth() * 0.5f) + hl.L(20.0f), hl.L(20.0f) - (paint.getStrokeWidth() * 2.0f), d), paint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(hl.L(56.0f), hl.L(56.0f));
        Path path = this.e;
        path.rewind();
        path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, hl.L(20.0f), Path.Direction.CW);
        Path path2 = this.f;
        path2.rewind();
        path2.moveTo(getMeasuredWidth(), 0.0f);
        path2.lineTo(getMeasuredWidth(), getMeasuredHeight());
        path2.lineTo(0.0f, getMeasuredHeight());
        path2.close();
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.a.setColor(i);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        super.setPressed(z);
        this.r.c(z);
    }
}
