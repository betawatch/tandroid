package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class qe0 extends pe0 {
    public final /* synthetic */ re0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe0(re0 re0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = re0Var;
    }

    @Override // org.telegram.ui.Components.pe0
    public final void h(float f7) {
        LaunchActivity launchActivity = LaunchActivity.J1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = launchActivity.z0;
        b4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        b4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.pe0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.J1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = launchActivity.z0;
        b4Var.setScaleX(1.0f);
        b4Var.setScaleY(1.0f);
    }
}
