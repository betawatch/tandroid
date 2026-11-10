package org.telegram.ui.Components;

import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        org.telegram.ui.ActionBar.o3 o3Var = launchActivity.x0;
        o3Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
        o3Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.ec0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.o3 o3Var = launchActivity.x0;
        o3Var.setScaleX(1.0f);
        o3Var.setScaleY(1.0f);
    }
}
