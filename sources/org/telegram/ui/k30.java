package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k30 implements org.telegram.ui.ActionBar.t2 {
    public final /* synthetic */ b50 a;

    public k30(b50 b50Var) {
        this.a = b50Var;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final void w() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        b50 b50Var = this.a;
        if (b50Var.w3 == 6) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (d12.getBoolean("reminderhint", false)) {
                return;
            }
            d12.edit().putBoolean("reminderhint", true).commit();
            if (b50Var.e2 == null) {
                org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(b50Var.getContext(), 8);
                b50Var.e2 = q30Var;
                q30Var.setAlpha(0.0f);
                b50Var.e2.setVisibility(4);
                b50Var.e2.setShowingDuration(4000L);
                b50Var.b.addView(b50Var.e2, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                b50Var.e2.setText(org.telegram.messenger.cd.L0(2131743464, null));
                b50Var.e2.d();
            }
            b50Var.e2.setExtraTranslationY(-org.telegram.messenger.i0.m);
            b50Var.e2.f(b50Var.s1, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public final boolean y() {
        return true;
    }
}
