package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class me0 extends le0 {
    public final /* synthetic */ ne0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me0(ne0 ne0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.j0 = ne0Var;
    }

    @Override // org.telegram.ui.Components.le0
    public final void g(float f7) {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.z0;
        y3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        y3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.le0
    public final void i() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.z0;
        y3Var.setScaleX(1.0f);
        y3Var.setScaleY(1.0f);
    }
}
