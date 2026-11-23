package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ex0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ String a;
    public final /* synthetic */ hx0 b;

    public ex0(hx0 hx0Var, String str) {
        this.b = hx0Var;
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
        hx0 hx0Var = this.b;
        long j3 = hx0Var.h;
        long j10 = hx0Var.f;
        String str = this.a;
        if (i7 == -1) {
            if (!hx0Var.n && hx0Var.r) {
                i16 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                org.telegram.messenger.mp.u1(i16).g7.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.mp.u1(i10).g7;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.mp.u1(i11).R.f(j10);
            if (hx0Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                    org.telegram.messenger.tr.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                    org.telegram.messenger.xs.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
                    org.telegram.messenger.tr.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i14 = ((org.telegram.ui.ActionBar.g2) hx0Var).currentAccount;
            org.telegram.messenger.xs.t(i14).c0(hx0Var.f, hx0Var.h, true);
            if (hx0Var.s != null) {
                sh0 sh0Var = new sh0();
                sh0Var.d = j10;
                sh0Var.b = true;
                int c10 = org.telegram.messenger.f3.c("notify2_", str, sharedPreferences, 0);
                sh0Var.c = c10;
                if (c10 != 0) {
                    sh0Var.a = org.telegram.messenger.f3.c("notifyuntil_", str, sharedPreferences, 0);
                }
                hx0Var.s.n(sh0Var);
            }
        }
        hx0Var.finishFragment();
    }
}
