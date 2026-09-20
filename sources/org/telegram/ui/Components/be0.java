package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class be0 extends ae0 {
    public final /* synthetic */ ce0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be0(ce0 ce0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.b0 = ce0Var;
    }

    @Override // org.telegram.ui.Components.ae0
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.z0;
        z3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        z3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.ae0
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
