package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class qc0 extends pc0 {
    public final /* synthetic */ rc0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc0(rc0 rc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.k0 = rc0Var;
    }

    @Override // org.telegram.ui.Components.pc0
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.p3 p3Var = launchActivity.y0;
        p3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        p3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.pc0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.p3 p3Var = launchActivity.y0;
        p3Var.setScaleX(1.0f);
        p3Var.setScaleY(1.0f);
    }
}
