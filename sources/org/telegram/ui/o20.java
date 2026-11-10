package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o20 implements org.telegram.ui.ActionBar.q2 {
    public final /* synthetic */ f40 a;

    public o20(f40 f40Var) {
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
        if (f40Var.z3 == 6) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (e12.getBoolean("reminderhint", false)) {
                return;
            }
            e12.edit().putBoolean("reminderhint", true).commit();
            if (f40Var.h2 == null) {
                org.telegram.ui.Components.y20 y20Var = new org.telegram.ui.Components.y20(f40Var.getContext(), 8);
                f40Var.h2 = y20Var;
                y20Var.setAlpha(0.0f);
                f40Var.h2.setVisibility(4);
                f40Var.h2.setShowingDuration(4000L);
                f40Var.b.addView(f40Var.h2, c8.ha.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                f40Var.h2.setText(org.telegram.messenger.id.M0(2131743438, null));
                f40Var.h2.b();
            }
            f40Var.h2.setExtraTranslationY(-org.telegram.messenger.g0.m);
            f40Var.h2.c(f40Var.v1);
        }
    }

    @Override // org.telegram.ui.ActionBar.q2
    public final boolean x() {
        return true;
    }
}
