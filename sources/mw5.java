// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mw5 extends e34 {
    public final Paint h;
    public long n;
    public float r;
    public float s;
    public final /* synthetic */ q88 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw5(q88 q88Var, Context context, gi3 gi3Var) {
        super(context, gi3Var);
        this.w = q88Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(gl.L(2.0f));
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
        q88 q88Var = this.w;
        l34 l34Var = q88Var.I0;
        if (l34Var == null || l34Var.r || !l34Var.n) {
            i = 0;
            i2 = 0;
        } else {
            i = l34Var.getStickyX();
            i2 = q88Var.I0.getStickyY();
        }
        float f = this.r;
        if (i != 0) {
            if (f != 1.0f) {
                this.r = ls6.z(min, 150.0f, f, 1.0f);
                invalidate();
            }
        } else if (f != 0.0f) {
            this.r = oo1.x(min, 150.0f, f, 0.0f);
            invalidate();
        }
        float f2 = this.s;
        if (i2 != 0) {
            if (f2 != 1.0f) {
                this.s = ls6.z(min, 150.0f, f2, 1.0f);
                invalidate();
            }
        } else if (f2 != 0.0f) {
            this.s = oo1.x(min, 150.0f, f2, 0.0f);
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
