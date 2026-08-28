package org.telegram.ui;

import android.graphics.Canvas;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class le1 extends FrameLayout {
    public TextView a;
    public float b;
    public boolean c;

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            float f10 = this.b + 0.013333334f;
            this.b = f10;
            if (f10 > 1.0f) {
                this.c = false;
                this.b = 1.0f;
            }
        } else {
            float f11 = this.b - 0.013333334f;
            this.b = f11;
            if (f11 < 0.0f) {
                this.c = true;
                this.b = 0.0f;
            }
        }
        this.a.setTranslationX(org.telegram.ui.Components.gr.f.getInterpolation(this.b) * AndroidUtilities.dp(8.0f) * (LocaleController.isRTL ? -1 : 1));
        invalidate();
    }
}
