package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class c extends TextView {
    public boolean a;

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.a) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.ui.ActionBar.k6.U1);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9 = this.a;
        if (motionEvent.getAction() == 0) {
            this.a = true;
        } else if (motionEvent.getAction() != 2) {
            this.a = false;
        }
        if (z9 != this.a) {
            invalidate();
        }
        return this.a || super.onTouchEvent(motionEvent);
    }
}
