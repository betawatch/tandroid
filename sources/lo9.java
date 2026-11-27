// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class lo9 extends FrameLayout {
    public final Paint a;
    public final hq8 b;
    public final RectF c;
    public final float d;
    public float e;

    public lo9(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        hq8 hq8Var = new hq8(this, (byte) 1);
        this.b = hq8Var;
        this.c = new RectF();
        this.d = (hl.L(3.0f) * 0.5f) + hl.L(5.0f);
        a(paint, 0.2f);
        a(hq8Var, 1.0f);
        setWillNotDraw(false);
    }

    public static void a(Paint paint, float f) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(hl.L(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float width = getWidth();
        float f = this.d;
        RectF rectF = this.c;
        rectF.set(f, f, width - f, getHeight() - f);
        canvas.drawOval(rectF, this.a);
        canvas.drawArc(rectF, -90.0f, this.e * 360.0f, false, this.b);
    }

    public Paint getPaint() {
        return this.b;
    }

    public void setProgress(float f) {
        float max = Math.max(0.0f, Math.min(1.0f, f));
        if (this.e == max) {
            return;
        }
        this.e = max;
        invalidate();
    }
}
