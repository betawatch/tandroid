package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class rc0 extends qc0 {
    public final /* synthetic */ sc0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc0(sc0 sc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = sc0Var;
    }

    @Override // org.telegram.ui.Components.qc0
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.o3 o3Var = launchActivity.y0;
        o3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        o3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.qc0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.o3 o3Var = launchActivity.y0;
        o3Var.setScaleX(1.0f);
        o3Var.setScaleY(1.0f);
    }
}
