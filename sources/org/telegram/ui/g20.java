package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g20 implements org.telegram.ui.ActionBar.n2 {
    public final /* synthetic */ x30 a;

    public g20(x30 x30Var) {
        this.a = x30Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        x30 x30Var = this.a;
        if (x30Var.x3 == 6) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (e12.getBoolean("reminderhint", false)) {
                return;
            }
            e12.edit().putBoolean("reminderhint", true).commit();
            if (x30Var.f2 == null) {
                org.telegram.ui.Components.u20 u20Var = new org.telegram.ui.Components.u20(x30Var.getContext(), 8);
                x30Var.f2 = u20Var;
                u20Var.setAlpha(0.0f);
                x30Var.f2.setVisibility(4);
                x30Var.f2.setShowingDuration(4000L);
                x30Var.b.addView(x30Var.f2, b8.mf.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                x30Var.f2.setText(org.telegram.messenger.bd.M0(2131743448, null));
                x30Var.f2.b();
            }
            x30Var.f2.setExtraTranslationY(-org.telegram.messenger.g0.m);
            x30Var.f2.c(x30Var.t1);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean x() {
        return true;
    }
}
