package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class fc0 extends ec0 {
    public final /* synthetic */ gc0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(gc0 gc0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = gc0Var;
    }

    @Override // org.telegram.ui.Components.ec0
    public final void h(float f10) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.n3 n3Var = launchActivity.x0;
        n3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        n3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.ec0
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
