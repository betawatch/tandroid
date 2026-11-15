package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gc0 extends fc0 {
    public final /* synthetic */ hc0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc0(hc0 hc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = hc0Var;
    }

    @Override // org.telegram.ui.Components.fc0
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.l3 l3Var = launchActivity.y0;
        l3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        l3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.fc0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.l3 l3Var = launchActivity.y0;
        l3Var.setScaleX(1.0f);
        l3Var.setScaleY(1.0f);
    }
}
