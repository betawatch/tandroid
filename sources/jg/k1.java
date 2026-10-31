package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k1 extends View {
    public final Paint a;
    public float b;

    public k1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.a;
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(5.33f, 0.0f, this.b)), (getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-5.33f, -7.0f, this.b)), paint);
        canvas.drawLine((getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(5.33f, 3.0f, this.b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(5.33f, 7.0f, this.b)), (getWidth() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-5.33f, -4.0f, this.b)), (getHeight() / 2.0f) + org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(-5.33f, 0.0f, this.b)), paint);
    }

    public void setProgress(float f7) {
        this.b = f7;
        invalidate();
    }
}
