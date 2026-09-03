package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xd0 extends wd0 {
    public final /* synthetic */ yd0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd0(yd0 yd0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.V = yd0Var;
    }

    @Override // org.telegram.ui.Components.wd0
    public final void f(float f10) {
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.y3 y3Var = launchActivity.w0;
        y3Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f10));
        y3Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f10));
    }

    @Override // org.telegram.ui.Components.wd0
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
