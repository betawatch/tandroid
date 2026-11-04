package gi;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.h10;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class m6 extends FrameLayout {
    public ValueAnimator E;
    public float F;
    public final l6 a;
    public final File b;
    public long c;
    public long d;
    public final Paint e;
    public final Paint f;
    public final i6 h;
    public ei.d0 n;
    public n r;
    public float s;
    public ug.r1 w;
    public ValueAnimator x;
    public boolean y;

    public m6(Context context) {
        super(context);
        this.c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new i6(this, 0);
        this.s = 1.0f;
        this.y = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.b = f7.x(h10.t0, true);
        l6 l6Var = new l6(this, context);
        this.a = l6Var;
        l6Var.setScaleX(0.0f);
        l6Var.setScaleY(0.0f);
        addView(l6Var);
        l6Var.setDelegate(new j6(this));
        l6Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.r;
        if (nVar != null) {
            nVar.run();
            this.r = null;
        }
        org.telegram.messenger.g0.r(this.h);
        this.a.destroy(true, null);
        try {
            this.b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, 1.0f);
        this.E = ofFloat;
        ofFloat.addUpdateListener(new j3(this, 4));
        this.E.addListener(new ai.e1(this, 25));
        this.E.setInterpolator(xq.h);
        this.E.setDuration(280L);
        this.E.start();
    }

    public final long b() {
        if (this.c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.c);
    }

    public abstract void c();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = org.telegram.messenger.g0.P;
        l6 l6Var = this.a;
        rectF.set(((1.0f - l6Var.getScaleX()) * (l6Var.getWidth() / 2.0f)) + l6Var.getX(), ((1.0f - l6Var.getScaleY()) * (l6Var.getHeight() / 2.0f)) + l6Var.getY(), (l6Var.getX() + l6Var.getWidth()) - ((1.0f - l6Var.getScaleX()) * (l6Var.getWidth() / 2.0f)), (l6Var.getY() + l6Var.getHeight()) - ((1.0f - l6Var.getScaleY()) * (l6Var.getHeight() / 2.0f)));
        float L = org.telegram.messenger.g0.L(2.0f);
        float L2 = org.telegram.messenger.g0.L(0.66f);
        int r12 = org.telegram.ui.ActionBar.k6.r1(this.s, TLObject.FLAG_29);
        Paint paint = this.e;
        paint.setShadowLayer(L, 0.0f, L2, r12);
        paint.setAlpha((int) (this.s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        ug.r1 r1Var = this.w;
        if (r1Var != null && r1Var.getWidth() > 0 && this.w.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.w.getWidth(), rectF.height() / this.w.getHeight());
            float alpha = this.w.getAlpha();
            this.w.setDraw(true);
            this.w.setAlpha(1.0f - this.s);
            this.w.draw(canvas);
            this.w.setAlpha(alpha);
            this.w.setDraw(false);
            canvas.restore();
        }
        if (this.c > 0) {
            float i3 = Utilities.i(b() / 59500.0f, 1.0f, 0.0f);
            float L3 = org.telegram.messenger.g0.L(3.33f);
            Paint paint2 = this.f;
            paint2.setStrokeWidth(L3);
            paint2.setColor(org.telegram.ui.ActionBar.k6.r1(this.s, -1090519041));
            paint2.setShadowLayer(org.telegram.messenger.g0.L(1.0f), 0.0f, org.telegram.messenger.g0.L(0.33f), org.telegram.ui.ActionBar.k6.r1(this.s, TLObject.FLAG_29));
            rectF.inset(-org.telegram.messenger.g0.L(7.665f), -org.telegram.messenger.g0.L(7.665f));
            canvas.drawArc(rectF, -90.0f, i3 * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        l6 l6Var = this.a;
        int measuredWidth = ((i11 - i3) - l6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(16.0f);
        int L = org.telegram.messenger.g0.L(72.0f);
        l6Var.layout(measuredWidth, L, l6Var.getMeasuredWidth() + measuredWidth, l6Var.getMeasuredHeight() + L);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i10);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
