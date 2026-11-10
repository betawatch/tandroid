package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class pl0 extends rl0 {
    public int G;
    public final /* synthetic */ km0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl0(km0 km0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.H = km0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.rl0
    public final void a() {
        km0 km0Var = this.H;
        if (km0Var.getParentActivity() != null) {
            org.telegram.messenger.g0.p3(km0Var.getParentActivity(), km0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = km0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = km0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        km0Var.K0();
        km0Var.F0();
    }
}
