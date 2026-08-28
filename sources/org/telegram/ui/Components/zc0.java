package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class zc0 extends yc0 {
    public final /* synthetic */ ad0 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(ad0 ad0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.U = ad0Var;
    }

    @Override // org.telegram.ui.Components.yc0
    public final void f(float f10) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.v0;
        x3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f10));
        x3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.yc0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.x3 x3Var = launchActivity.v0;
        x3Var.setScaleX(1.0f);
        x3Var.setScaleY(1.0f);
    }
}
