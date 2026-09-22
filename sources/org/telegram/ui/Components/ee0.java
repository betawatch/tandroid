package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ee0 extends de0 {
    public final /* synthetic */ fe0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee0(fe0 fe0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.b0 = fe0Var;
    }

    @Override // org.telegram.ui.Components.de0
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.z0;
        z3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        z3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.de0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.z0;
        z3Var.setScaleX(1.0f);
        z3Var.setScaleY(1.0f);
    }
}
