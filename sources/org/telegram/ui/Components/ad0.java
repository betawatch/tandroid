package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ad0 extends zc0 {
    public final /* synthetic */ bd0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad0(bd0 bd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = bd0Var;
    }

    @Override // org.telegram.ui.Components.zc0
    public final void h(float f7) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.s3 s3Var = launchActivity.z0;
        s3Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 1.25f, f7));
        s3Var.setScaleY(org.telegram.messenger.i0.T1(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.zc0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.s3 s3Var = launchActivity.z0;
        s3Var.setScaleX(1.0f);
        s3Var.setScaleY(1.0f);
    }
}
