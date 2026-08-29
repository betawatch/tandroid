package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class oe1 extends FrameLayout {
    public TextView a;
    public float b;
    public boolean c;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            float f9 = this.b + 0.013333334f;
            this.b = f9;
            if (f9 > 1.0f) {
                this.c = false;
                this.b = 1.0f;
            }
        } else {
            float f10 = this.b - 0.013333334f;
            this.b = f10;
            if (f10 < 0.0f) {
                this.c = true;
                this.b = 0.0f;
            }
        }
        this.a.setTranslationX(org.telegram.ui.Components.jr.f.getInterpolation(this.b) * AndroidUtilities.dp(8.0f) * (LocaleController.isRTL ? -1 : 1));
        invalidate();
    }
}
