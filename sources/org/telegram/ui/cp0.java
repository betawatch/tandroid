package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class cp0 extends gp0 {
    public int G;
    public final /* synthetic */ aq0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(aq0 aq0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.H = aq0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.gp0
    public final void a() {
        aq0 aq0Var = this.H;
        if (aq0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(aq0Var.getParentActivity(), aq0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = aq0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = aq0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        aq0Var.G0();
        aq0Var.A0();
    }
}
