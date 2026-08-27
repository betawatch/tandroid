package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ed0 extends dd0 {
    public final /* synthetic */ fd0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed0(fd0 fd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = fd0Var;
    }

    @Override // org.telegram.ui.Components.dd0
    public final void f(float f10) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.v0;
        x3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f10));
        x3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.dd0
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
