// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class l0c extends FrameLayout {
    public final de0 a;
    public final Paint b;
    public final RectF c;
    public final mm d;
    public k0c e;
    public String f;
    public wl h;
    public int n;
    public boolean r;
    public final /* synthetic */ n0c s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0c(n0c n0cVar, Context context) {
        super(context);
        this.s = n0cVar;
        this.b = new Paint(1);
        this.c = new RectF();
        this.d = new mm(this, 0L, 260L, k43.h);
        setWillNotDraw(false);
        iye.a(this);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        addView(de0Var, tre.d(20, 20.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z) {
        boolean z2;
        k0c k0cVar = this.e;
        if (k0cVar != null) {
            long j = k0cVar.a;
            n0c n0cVar = this.s;
            if (j == 0 ? k0cVar.b.equals(n0cVar.W) : j == n0cVar.V) {
                z2 = true;
                this.r = z2;
                if (!z) {
                    this.d.e(true, z2 ? 1.0f : 0.0f);
                }
                invalidate();
            }
        }
        z2 = false;
        this.r = z2;
        if (!z) {
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        n0c n0cVar = this.s;
        TextPaint textPaint = n0cVar.l0;
        vnb vnbVar = n0cVar.e;
        float e = this.d.e(false, this.r ? 1.0f : 0.0f);
        int v0 = aob.v0(aob.tk, vnbVar);
        RectF rectF = this.c;
        rectF.set(hl.L(3.0f), (getHeight() - hl.L(28.0f)) / 2.0f, getWidth() - hl.L(3.0f), (hl.L(28.0f) + getHeight()) / 2.0f);
        int f = vm2.f(e, aob.v0(aob.O5, vnbVar), v0);
        Paint paint = this.b;
        paint.setColor(f);
        canvas.drawRoundRect(rectF, hl.L(10.0f), hl.L(10.0f), paint);
        int f2 = vm2.f(e, aob.v0(aob.G6, vnbVar), aob.v0(aob.wk, vnbVar));
        wl wlVar = this.h;
        if (wlVar != null && this.n != f2) {
            this.n = f2;
            wlVar.setColorFilter(new PorterDuffColorFilter(f2, PorterDuff.Mode.SRC_IN));
            this.a.invalidate();
        }
        if (this.f != null) {
            textPaint.setColor(f2);
            canvas.drawText(this.f, hl.L(15.0f), rectF.centerY() - ((textPaint.ascent() + textPaint.descent()) / 2.0f), textPaint);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        if (this.f == null) {
            L = hl.L(44.0f);
        } else {
            L = hl.L(15.0f) + hl.L(15.0f) + ((int) Math.ceil(this.s.l0.measureText(this.f)));
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_30), i2);
    }
}
