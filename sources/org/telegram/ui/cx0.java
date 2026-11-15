package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class cx0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ String a;
    public final /* synthetic */ fx0 b;

    public cx0(fx0 fx0Var, String str) {
        this.b = fx0Var;
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
        fx0 fx0Var = this.b;
        long j3 = fx0Var.h;
        long j10 = fx0Var.f;
        String str = this.a;
        if (i7 == -1) {
            if (!fx0Var.n && fx0Var.r) {
                i16 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                org.telegram.messenger.np.s1(i16).e7.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i7 == 1) {
            i10 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
            SharedPreferences sharedPreferences = org.telegram.messenger.np.s1(i10).e7;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i11 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) org.telegram.messenger.np.s1(i11).R.f(j10);
            if (fx0Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j3 == 0) {
                    i15 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    org.telegram.messenger.vr.a0(i15).E1(j10, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j3 == 0) {
                    i12 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    org.telegram.messenger.at.t(i12).N(j10);
                    i13 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
                    org.telegram.messenger.vr.a0(i13).E1(j10, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i14 = ((org.telegram.ui.ActionBar.e2) fx0Var).currentAccount;
            org.telegram.messenger.at.t(i14).c0(fx0Var.f, fx0Var.h, true);
            if (fx0Var.s != null) {
                qh0 qh0Var = new qh0();
                qh0Var.d = j10;
                qh0Var.b = true;
                int c10 = org.telegram.messenger.k5.c("notify2_", str, sharedPreferences, 0);
                qh0Var.c = c10;
                if (c10 != 0) {
                    qh0Var.a = org.telegram.messenger.k5.c("notifyuntil_", str, sharedPreferences, 0);
                }
                fx0Var.s.d(qh0Var);
            }
        }
        fx0Var.finishFragment();
    }
}
