package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class dx0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ String a;
    public final /* synthetic */ gx0 b;

    public dx0(gx0 gx0Var, String str) {
        this.b = gx0Var;
        this.a = str;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        gx0 gx0Var = this.b;
        long j3 = gx0Var.h;
        long j10 = gx0Var.f;
        String str = this.a;
        if (i7 == -1) {
            if (!gx0Var.n && gx0Var.r) {
                i16 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                org.telegram.messenger.qp.s1(i16).d7.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i10).d7;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.qp.s1(i11).Q.f(j10);
            if (gx0Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                    org.telegram.messenger.yr.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                    org.telegram.messenger.dt.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
                    org.telegram.messenger.yr.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i14 = ((org.telegram.ui.ActionBar.f2) gx0Var).currentAccount;
            org.telegram.messenger.dt.t(i14).c0(gx0Var.f, gx0Var.h, true);
            if (gx0Var.s != null) {
                oh0 oh0Var = new oh0();
                oh0Var.d = j10;
                oh0Var.b = true;
                int c10 = org.telegram.messenger.k5.c("notify2_", str, sharedPreferences, 0);
                oh0Var.c = c10;
                if (c10 != 0) {
                    oh0Var.a = org.telegram.messenger.k5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                gx0Var.s.t(oh0Var);
            }
        }
        gx0Var.finishFragment();
    }
}
