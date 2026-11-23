package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class gx0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ String a;
    public final /* synthetic */ jx0 b;

    public gx0(jx0 jx0Var, String str) {
        this.b = jx0Var;
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
        jx0 jx0Var = this.b;
        long j3 = jx0Var.h;
        long j10 = jx0Var.f;
        String str = this.a;
        if (i7 == -1) {
            if (!jx0Var.n && jx0Var.r) {
                i16 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                org.telegram.messenger.np.u1(i16).g7.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.np.u1(i10).g7;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.np.u1(i11).R.f(j10);
            if (jx0Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                    org.telegram.messenger.ur.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                    org.telegram.messenger.ys.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
                    org.telegram.messenger.ur.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i14 = ((org.telegram.ui.ActionBar.g2) jx0Var).currentAccount;
            org.telegram.messenger.ys.t(i14).c0(jx0Var.f, jx0Var.h, true);
            if (jx0Var.s != null) {
                uh0 uh0Var = new uh0();
                uh0Var.d = j10;
                uh0Var.b = true;
                int c10 = org.telegram.messenger.f3.c("notify2_", str, sharedPreferences, 0);
                uh0Var.c = c10;
                if (c10 != 0) {
                    uh0Var.a = org.telegram.messenger.f3.c("notifyuntil_", str, sharedPreferences, 0);
                }
                jx0Var.s.k(uh0Var);
            }
        }
        jx0Var.finishFragment();
    }
}
