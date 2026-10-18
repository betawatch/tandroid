package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class no0 extends qo0 {
    public int G;
    public final /* synthetic */ kp0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no0(kp0 kp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.H = kp0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.qo0
    public final void a() {
        kp0 kp0Var = this.H;
        if (kp0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(kp0Var.getParentActivity(), kp0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = kp0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = kp0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        kp0Var.G0();
        kp0Var.A0();
    }
}
