package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ep0 extends ip0 {
    public int G;
    public final /* synthetic */ cq0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(cq0 cq0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.H = cq0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.ip0
    public final void a() {
        cq0 cq0Var = this.H;
        if (cq0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(cq0Var.getParentActivity(), cq0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = cq0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = cq0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        cq0Var.G0();
        cq0Var.A0();
    }
}
