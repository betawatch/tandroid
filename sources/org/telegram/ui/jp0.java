package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jp0 extends mp0 {
    public int G;
    public final /* synthetic */ gq0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp0(gq0 gq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.H = gq0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.mp0
    public final void a() {
        gq0 gq0Var = this.H;
        if (gq0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(gq0Var.getParentActivity(), gq0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = gq0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = gq0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        gq0Var.G0();
        gq0Var.A0();
    }
}
