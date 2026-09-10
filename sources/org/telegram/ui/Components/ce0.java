package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ce0 extends be0 {
    public final /* synthetic */ de0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce0(de0 de0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.b0 = de0Var;
    }

    @Override // org.telegram.ui.Components.be0
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = launchActivity.z0;
        b4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        b4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.be0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = launchActivity.z0;
        b4Var.setScaleX(1.0f);
        b4Var.setScaleY(1.0f);
    }
}
