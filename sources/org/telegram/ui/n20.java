package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class n20 implements org.telegram.ui.ActionBar.q2 {
    public final /* synthetic */ f40 a;

    public n20(f40 f40Var) {
        this.a = f40Var;
    }

    @Override // org.telegram.ui.ActionBar.q2
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        f40 f40Var = this.a;
        if (f40Var.E3 == 6) {
            SharedPreferences g12 = org.telegram.messenger.np.g1();
            if (g12.getBoolean("reminderhint", false)) {
                return;
            }
            g12.edit().putBoolean("reminderhint", true).commit();
            if (f40Var.i2 == null) {
                org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(f40Var.getContext(), 8);
                f40Var.i2 = m30Var;
                m30Var.setAlpha(0.0f);
                f40Var.i2.setVisibility(4);
                f40Var.i2.setShowingDuration(4000L);
                f40Var.b.addView(f40Var.i2, c8.ma.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                f40Var.i2.setText(org.telegram.messenger.hd.N0(2131743193, null));
                f40Var.i2.b();
            }
            f40Var.i2.setExtraTranslationY(-org.telegram.messenger.g0.m);
            f40Var.i2.c(f40Var.w1);
        }
    }

    @Override // org.telegram.ui.ActionBar.q2
    public final boolean x() {
        return true;
    }
}
