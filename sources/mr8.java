// default package

import android.content.SharedPreferences;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mr8 extends c6 {
    public final /* synthetic */ String a;
    public final /* synthetic */ pr8 b;

    public mr8(pr8 pr8Var, String str) {
        this.b = pr8Var;
        this.a = str;
    }

    @Override // c6
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        pr8 pr8Var = this.b;
        long j = pr8Var.h;
        long j2 = pr8Var.f;
        String str = this.a;
        if (i == -1) {
            if (!pr8Var.n && pr8Var.r) {
                i8 = ((d) pr8Var).currentAccount;
                na7.q1(i8).W3.edit().putInt("notify2_" + str, 0).apply();
            }
        } else if (i == 1) {
            i2 = ((d) pr8Var).currentAccount;
            SharedPreferences sharedPreferences = na7.q1(i2).W3;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean("custom_" + str, true);
            i3 = ((d) pr8Var).currentAccount;
            TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(i3).R.f(j2);
            if (pr8Var.r) {
                edit.putInt("notify2_" + str, 0);
                if (j == 0) {
                    i7 = ((d) pr8Var).currentAccount;
                    ad7.Y(i7).B1(j2, 0L);
                    if (dialog != null) {
                        dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
                    }
                }
            } else {
                edit.putInt("notify2_" + str, 2);
                if (j == 0) {
                    i4 = ((d) pr8Var).currentAccount;
                    im7.n(i4).N(j2);
                    i5 = ((d) pr8Var).currentAccount;
                    ad7.Y(i5).B1(j2, 1L);
                    if (dialog != null) {
                        TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                        dialog.notify_settings = tL_peerNotifySettings;
                        tL_peerNotifySettings.mute_until = ConnectionsManager.DEFAULT_DATACENTER_ID;
                    }
                }
            }
            edit.apply();
            i6 = ((d) pr8Var).currentAccount;
            im7.n(i6).c0(pr8Var.f, pr8Var.h, true);
            if (pr8Var.s != null) {
                vm7 vm7Var = new vm7();
                vm7Var.d = j2;
                vm7Var.b = true;
                int g = ls6.g("notify2_", str, sharedPreferences, 0);
                vm7Var.c = g;
                if (g != 0) {
                    vm7Var.a = ls6.g("notifyuntil_", str, sharedPreferences, 0);
                }
                pr8Var.s.h(vm7Var);
            }
        }
        pr8Var.finishFragment();
    }
}
