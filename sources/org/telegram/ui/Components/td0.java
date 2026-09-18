package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class td0 extends sd0 {
    public final /* synthetic */ ud0 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(ud0 ud0Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.b0 = ud0Var;
    }

    @Override // org.telegram.ui.Components.sd0
    public final void f(float f7) {
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.a4 a4Var = launchActivity.z0;
        a4Var.setScaleX(AndroidUtilities.lerp(1.0f, 1.25f, f7));
        a4Var.setScaleY(AndroidUtilities.lerp(1.0f, 1.25f, f7));
    }

    @Override // org.telegram.ui.Components.sd0
    public final void h() {
        super/*android.app.Dialog*/.dismiss();
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            return;
        }
        org.telegram.ui.ActionBar.a4 a4Var = launchActivity.z0;
        a4Var.setScaleX(1.0f);
        a4Var.setScaleY(1.0f);
    }
}
