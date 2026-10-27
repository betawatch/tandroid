package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ne0 extends me0 {
    public final /* synthetic */ oe0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne0(oe0 oe0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = oe0Var;
    }

    @Override // org.telegram.ui.Components.me0
    public final void h(float f7) {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d4 d4Var = launchActivity.z0;
        d4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        d4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.me0
    public final void j() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.d4 d4Var = launchActivity.z0;
        d4Var.setScaleX(1.0f);
        d4Var.setScaleY(1.0f);
    }
}
