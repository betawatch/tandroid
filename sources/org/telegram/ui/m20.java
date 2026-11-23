package org.telegram.ui;

import android.content.SharedPreferences;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m20 implements org.telegram.ui.ActionBar.q2 {
    public final /* synthetic */ e40 a;

    public m20(e40 e40Var) {
        this.a = e40Var;
    }

    @Override // org.telegram.ui.ActionBar.q2
    public final void v() {
        CountDownLatch groupCallBottomSheetLatch;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && (groupCallBottomSheetLatch = sharedInstance.getGroupCallBottomSheetLatch()) != null) {
            groupCallBottomSheetLatch.countDown();
        }
        e40 e40Var = this.a;
        if (e40Var.E3 == 6) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (g12.getBoolean("reminderhint", false)) {
                return;
            }
            g12.edit().putBoolean("reminderhint", true).commit();
            if (e40Var.i2 == null) {
                org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(e40Var.getContext(), 8);
                e40Var.i2 = j30Var;
                j30Var.setAlpha(0.0f);
                e40Var.i2.setVisibility(4);
                e40Var.i2.setShowingDuration(4000L);
                e40Var.b.addView(e40Var.i2, c8.na.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                e40Var.i2.setText(org.telegram.messenger.gd.N0(2131743188, null));
                e40Var.i2.b();
            }
            e40Var.i2.setExtraTranslationY(-org.telegram.messenger.g0.m);
            e40Var.i2.c(e40Var.w1);
        }
    }

    @Override // org.telegram.ui.ActionBar.q2
    public final boolean x() {
        return true;
    }
}
