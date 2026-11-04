package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ac0 extends zb0 {
    public final /* synthetic */ bc0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac0(bc0 bc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = bc0Var;
    }

    @Override // org.telegram.ui.Components.zb0
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.l3 l3Var = launchActivity.A0;
        l3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        l3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.zb0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.l3 l3Var = launchActivity.A0;
        l3Var.setScaleX(1.0f);
        l3Var.setScaleY(1.0f);
    }
}
