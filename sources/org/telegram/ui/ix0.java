package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ix0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ String a;
    public final /* synthetic */ lx0 b;

    public ix0(lx0 lx0Var, String str) {
        this.b = lx0Var;
        this.a = str;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        lx0 lx0Var = this.b;
        long j3 = lx0Var.h;
        long j10 = lx0Var.f;
        String str = this.a;
        if (i7 == -1) {
            if (!lx0Var.n && lx0Var.r) {
                i16 = ((org.telegram.ui.ActionBar.f2) lx0Var).currentAccount;
                org.telegram.messenger.qp.s1(i16).d7.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.f2) lx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.qp.s1(i10).d7;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.f2) lx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.qp.s1(i11).Q.f(j10);
            if (lx0Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.f2) lx0Var).currentAccount;
                    org.telegram.messenger.yr.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.f2) lx0Var).currentAccount;
                    org.telegram.messenger.dt.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.f2) lx0Var).currentAccount;
                    org.telegram.messenger.yr.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i14 = ((org.telegram.ui.ActionBar.f2) lx0Var).currentAccount;
            org.telegram.messenger.dt.t(i14).c0(lx0Var.f, lx0Var.h, true);
            if (lx0Var.s != null) {
                rh0 rh0Var = new rh0();
                rh0Var.d = j10;
                rh0Var.b = true;
                int c10 = org.telegram.messenger.k5.c("notify2_", str, sharedPreferences, 0);
                rh0Var.c = c10;
                if (c10 != 0) {
                    rh0Var.a = org.telegram.messenger.k5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                lx0Var.s.t(rh0Var);
            }
        }
        lx0Var.finishFragment();
    }
}
