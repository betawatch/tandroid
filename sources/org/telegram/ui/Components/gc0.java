package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class gc0 extends fc0 {
    public final /* synthetic */ hc0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc0(hc0 hc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = hc0Var;
    }

    @Override // org.telegram.ui.Components.fc0
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.n3 n3Var = launchActivity.x0;
        n3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        n3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.fc0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.n3 n3Var = launchActivity.x0;
        n3Var.setScaleX(1.0f);
        n3Var.setScaleY(1.0f);
    }
}
