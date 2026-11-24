// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class my5 extends p44 {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public final /* synthetic */ sa8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my5(sa8 sa8Var, Context context, lj4 lj4Var) {
        super(context, lj4Var);
        this.w = sa8Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        Canvas canvas2;
        super.onDraw(canvas);
        long min = Math.min(16L, System.currentTimeMillis() - this.n);
        this.n = System.currentTimeMillis();
        sa8 sa8Var = this.w;
        w44 w44Var = sa8Var.I0;
        if (w44Var == null || w44Var.r || !w44Var.n) {
            i = 0;
            i2 = 0;
        } else {
            i = w44Var.getStickyX();
            i2 = sa8Var.I0.getStickyY();
        }
        float f = this.r;
        if (i != 0) {
            if (f != 1.0f) {
                this.r = kt6.A(min, 150.0f, f, 1.0f);
                invalidate();
            }
        } else if (f != 0.0f) {
            this.r = aq1.x(min, 150.0f, f, 0.0f);
            invalidate();
        }
        float f2 = this.s;
        if (i2 != 0) {
            if (f2 != 1.0f) {
                this.s = kt6.A(min, 150.0f, f2, 1.0f);
                invalidate();
            }
        } else if (f2 != 0.0f) {
            this.s = aq1.x(min, 150.0f, f2, 0.0f);
            invalidate();
        }
        float f3 = this.s;
        Paint paint = this.h;
        if (f3 != 0.0f) {
            paint.setAlpha((int) (f3 * 255.0f));
            float measuredHeight = getMeasuredHeight() / 2.0f;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, paint);
        } else {
            canvas2 = canvas;
        }
        float f4 = this.r;
        if (f4 != 0.0f) {
            paint.setAlpha((int) (f4 * 255.0f));
            float measuredWidth = getMeasuredWidth() / 2.0f;
            canvas2.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), paint);
        }
    }
}
