package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class fe0 extends ee0 {
    public final /* synthetic */ ge0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe0(ge0 ge0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.b0 = ge0Var;
    }

    @Override // org.telegram.ui.Components.ee0
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.z0;
        x3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        x3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.ee0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.z0;
        x3Var.setScaleX(1.0f);
        x3Var.setScaleY(1.0f);
    }
}
