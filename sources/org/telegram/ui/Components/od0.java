package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class od0 extends nd0 {
    public final /* synthetic */ pd0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od0(pd0 pd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = pd0Var;
    }

    @Override // org.telegram.ui.Components.nd0
    public final void f(float f9) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.v0;
        x3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f9));
        x3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f9));
    }

    @Override // org.telegram.ui.Components.nd0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.v0;
        x3Var.setScaleX(1.0f);
        x3Var.setScaleY(1.0f);
    }
}
