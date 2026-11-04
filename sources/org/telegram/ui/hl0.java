package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class hl0 extends jl0 {
    public int H;
    public final /* synthetic */ cm0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl0(cm0 cm0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.I = cm0Var;
        this.H = 0;
    }

    @Override // org.telegram.ui.jl0
    public final void a() {
        cm0 cm0Var = this.I;
        if (cm0Var.getParentActivity() != null) {
            org.telegram.messenger.g0.p3(cm0Var.getParentActivity(), cm0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.H != actionBarButtonColor) {
            ImageView imageView = cm0Var.K;
            if (imageView != null) {
                this.H = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = cm0Var.L;
            if (imageView2 != null) {
                this.H = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        cm0Var.K0();
        cm0Var.F0();
    }
}
