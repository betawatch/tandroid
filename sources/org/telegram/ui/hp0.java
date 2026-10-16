package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class hp0 extends kp0 {
    public int G;
    public final /* synthetic */ eq0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(eq0 eq0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.H = eq0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.kp0
    public final void a() {
        eq0 eq0Var = this.H;
        if (eq0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(eq0Var.getParentActivity(), eq0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = eq0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = eq0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        eq0Var.G0();
        eq0Var.A0();
    }
}
