// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dv7 extends View {
    public final Paint a;
    public float b;

    public dv7(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(hl.L(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        canvas.drawLine((getWidth() / 2.0f) + hl.L(hl.R1(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + hl.L(hl.R1(5.33f, 0.0f, this.b)), (getWidth() / 2.0f) + hl.L(hl.R1(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + hl.L(hl.R1(-5.33f, -7.0f, this.b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + hl.L(hl.R1(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + hl.L(hl.R1(5.33f, 7.0f, this.b)), (getWidth() / 2.0f) + hl.L(hl.R1(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + hl.L(hl.R1(-5.33f, 0.0f, this.b)), paint);
    }

    public void setProgress(float f) {
        this.b = f;
        invalidate();
    }
}
