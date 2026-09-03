package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class me1 extends FrameLayout {
    public ValueAnimator a;
    public boolean b;
    public float c;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f10 = ((1.0f - this.c) * 0.2f) + 0.8f;
        canvas.save();
        canvas.scale(f10, f10, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (isPressed()) {
            float f11 = this.c;
            if (f11 != 1.0f) {
                this.c = Utilities.clamp(f11 + 0.16f, 1.0f, 0.0f);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z4) {
        ValueAnimator valueAnimator;
        super.setPressed(z4);
        if (this.b != z4) {
            this.b = z4;
            invalidate();
            if (z4 && (valueAnimator = this.a) != null) {
                valueAnimator.removeAllListeners();
                this.a.cancel();
            }
            if (z4) {
                return;
            }
            float f10 = this.c;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new n11(this, 16));
                this.a.addListener(new ss0(this, 22));
                this.a.setInterpolator(new OvershootInterpolator(5.0f));
                this.a.setDuration(350L);
                this.a.start();
            }
        }
    }
}
