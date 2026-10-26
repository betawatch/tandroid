package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class me0 extends le0 {
    public final /* synthetic */ ne0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me0(ne0 ne0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = ne0Var;
    }

    @Override // org.telegram.ui.Components.le0
    public final void h(float f7) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d4 d4Var = launchActivity.z0;
        d4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        d4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.le0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d4 d4Var = launchActivity.z0;
        d4Var.setScaleX(1.0f);
        d4Var.setScaleY(1.0f);
    }
}
