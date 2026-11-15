package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k20 implements org.telegram.ui.ActionBar.o2 {
    public final /* synthetic */ c40 a;

    public k20(c40 c40Var) {
        this.a = c40Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        c40 c40Var = this.a;
        if (c40Var.E3 == 6) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (e12.getBoolean("reminderhint", false)) {
                return;
            }
            e12.edit().putBoolean("reminderhint", true).commit();
            if (c40Var.i2 == null) {
                org.telegram.ui.Components.b30 b30Var = new org.telegram.ui.Components.b30(c40Var.getContext(), 8);
                c40Var.i2 = b30Var;
                b30Var.setAlpha(0.0f);
                c40Var.i2.setVisibility(4);
                c40Var.i2.setShowingDuration(4000L);
                c40Var.b.addView(c40Var.i2, c8.ja.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                c40Var.i2.setText(org.telegram.messenger.hd.M0(2131743438, null));
                c40Var.i2.b();
            }
            c40Var.i2.setExtraTranslationY(-org.telegram.messenger.g0.m);
            c40Var.i2.c(c40Var.w1);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean x() {
        return true;
    }
}
