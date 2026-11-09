package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class n20 implements org.telegram.ui.ActionBar.p2 {
    public final /* synthetic */ e40 a;

    public n20(e40 e40Var) {
        this.a = e40Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        e40 e40Var = this.a;
        if (e40Var.w3 == 6) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (e12.getBoolean("reminderhint", false)) {
                return;
            }
            e12.edit().putBoolean("reminderhint", true).commit();
            if (e40Var.e2 == null) {
                org.telegram.ui.Components.z20 z20Var = new org.telegram.ui.Components.z20(e40Var.getContext(), 8);
                e40Var.e2 = z20Var;
                z20Var.setAlpha(0.0f);
                e40Var.e2.setVisibility(4);
                e40Var.e2.setShowingDuration(4000L);
                e40Var.b.addView(e40Var.e2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                e40Var.e2.setText(org.telegram.messenger.id.M0(2131743438, null));
                e40Var.e2.b();
            }
            e40Var.e2.setExtraTranslationY(-org.telegram.messenger.g0.m);
            e40Var.e2.c(e40Var.s1);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean x() {
        return true;
    }
}
