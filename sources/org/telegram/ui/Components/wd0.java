package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class wd0 extends vd0 {
    public final /* synthetic */ xd0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd0(xd0 xd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = xd0Var;
    }

    @Override // org.telegram.ui.Components.vd0
    public final void f(float f10) {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.w0;
        y3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f10));
        y3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.vd0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.w0;
        y3Var.setScaleX(1.0f);
        y3Var.setScaleY(1.0f);
    }
}
