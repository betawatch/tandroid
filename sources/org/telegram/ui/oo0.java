package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class oo0 extends ro0 {
    public int G;
    public final /* synthetic */ lp0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0(lp0 lp0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.H = lp0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.ro0
    public final void a() {
        lp0 lp0Var = this.H;
        if (lp0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(lp0Var.getParentActivity(), lp0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = lp0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = lp0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        lp0Var.G0();
        lp0Var.A0();
    }
}
