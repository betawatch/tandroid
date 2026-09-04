package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class td0 extends sd0 {
    public final /* synthetic */ ud0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(ud0 ud0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.b0 = ud0Var;
    }

    @Override // org.telegram.ui.Components.sd0
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.z0;
        z3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        z3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.sd0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.z0;
        z3Var.setScaleX(1.0f);
        z3Var.setScaleY(1.0f);
    }
}
