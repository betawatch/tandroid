package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j30 implements org.telegram.ui.ActionBar.t2 {
    public final /* synthetic */ a50 a;

    public j30(a50 a50Var) {
        this.a = a50Var;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void w() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        a50 a50Var = this.a;
        if (a50Var.w3 == 6) {
            SharedPreferences d12 = org.telegram.messenger.wp.d1();
            if (d12.getBoolean("reminderhint", false)) {
                return;
            }
            d12.edit().putBoolean("reminderhint", true).commit();
            if (a50Var.e2 == null) {
                org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(a50Var.getContext(), 8);
                a50Var.e2 = q30Var;
                q30Var.setAlpha(0.0f);
                a50Var.e2.setVisibility(4);
                a50Var.e2.setShowingDuration(4000L);
                a50Var.b.addView(a50Var.e2, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                a50Var.e2.setText(org.telegram.messenger.dd.L0(2131743464, null));
                a50Var.e2.d();
            }
            a50Var.e2.setExtraTranslationY(-org.telegram.messenger.i0.m);
            a50Var.e2.f(a50Var.s1, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean y() {
        return true;
    }
}
