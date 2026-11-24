// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l1 extends TextView {
    public boolean a;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            RectF rectF = gl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, gl.L(4.0f), gl.L(4.0f), bkb.T1);
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
