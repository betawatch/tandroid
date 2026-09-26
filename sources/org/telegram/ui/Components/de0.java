package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class de0 extends ce0 {
    public final /* synthetic */ ee0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de0(ee0 ee0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.b0 = ee0Var;
    }

    @Override // org.telegram.ui.Components.ce0
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.z0;
        x3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        x3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.ce0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.z0;
        x3Var.setScaleX(1.0f);
        x3Var.setScaleY(1.0f);
    }
}
