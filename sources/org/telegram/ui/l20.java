package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class l20 implements org.telegram.ui.ActionBar.p2 {
    public final /* synthetic */ c40 a;

    public l20(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        c40 c40Var = this.a;
        if (c40Var.w3 == 6) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (e12.getBoolean("reminderhint", false)) {
                return;
            }
            e12.edit().putBoolean("reminderhint", true).commit();
            if (c40Var.e2 == null) {
                org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(c40Var.getContext(), 8);
                c40Var.e2 = y20Var;
                y20Var.setAlpha(0.0f);
                c40Var.e2.setVisibility(4);
                c40Var.e2.setShowingDuration(4000L);
                c40Var.b.addView(c40Var.e2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                c40Var.e2.setText(org.telegram.messenger.hd.M0(2131743439, null));
                c40Var.e2.b();
            }
            c40Var.e2.setExtraTranslationY(-org.telegram.messenger.g0.m);
            c40Var.e2.c(c40Var.s1);
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean x() {
        return true;
    }
}
