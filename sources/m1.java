// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class m1 extends TextView {
    public boolean a;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, hl.L(4.0f), hl.L(4.0f), aob.U1);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = this.a;
        if (motionEvent.getAction() == 0) {
            this.a = true;
        } else if (motionEvent.getAction() != 2) {
            this.a = false;
        }
        if (z != this.a) {
            invalidate();
        }
        return this.a || super.onTouchEvent(motionEvent);
    }
}
