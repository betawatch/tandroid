package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pd1 extends FrameLayout {
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
    public final void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        super.setPressed(z10);
        if (this.b != z10) {
            this.b = z10;
            invalidate();
            if (z10 && (valueAnimator = this.a) != null) {
                valueAnimator.removeAllListeners();
                this.a.cancel();
            }
            if (z10) {
                return;
            }
            float f10 = this.c;
            if (f10 != 0.0f) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                this.a = ofFloat;
                ofFloat.addUpdateListener(new v01(this, 16));
                this.a.addListener(new bc0(this, 29));
                this.a.setInterpolator(new OvershootInterpolator(5.0f));
                this.a.setDuration(350L);
                this.a.start();
            }
        }
    }
}
