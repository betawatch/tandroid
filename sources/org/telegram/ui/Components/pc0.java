package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class pc0 extends oc0 {
    public final /* synthetic */ qc0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc0(qc0 qc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = qc0Var;
    }

    @Override // org.telegram.ui.Components.oc0
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.o3 o3Var = launchActivity.y0;
        o3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        o3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.oc0
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
