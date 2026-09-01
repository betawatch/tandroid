package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class yd0 extends xd0 {
    public final /* synthetic */ zd0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd0(zd0 zd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = zd0Var;
    }

    @Override // org.telegram.ui.Components.xd0
    public final void f(float f10) {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.w0;
        z3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f10));
        z3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.xd0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.z3 z3Var = launchActivity.w0;
        z3Var.setScaleX(1.0f);
        z3Var.setScaleY(1.0f);
    }
}
