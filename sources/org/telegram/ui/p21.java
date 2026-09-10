package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class p21 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ u21 a;

    public p21(u21 u21Var) {
        this.a = u21Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        u21 u21Var = this.a;
        boolean z10 = u21Var.I;
        SharedConfig.ProxyInfo proxyInfo = u21Var.J;
        if (i10 == -1) {
            u21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || u21Var.getParentActivity() == null) {
            return;
        }
        ki.a a2 = ki.b.a();
        int i11 = u21Var.v;
        a2.a = i11 != 0 ? i11 : 1;
        String i12 = i11 == 3 ? ki.k.i(u21Var.a[0].getText().toString()) : u21Var.a[0].getText().toString();
        if (i12 == null) {
            i12 = "";
        }
        a2.b = i12;
        a2.c = u21Var.v == 3 ? 443 : Utilities.parseInt((CharSequence) u21Var.a[1].getText().toString()).intValue();
        String obj = u21Var.v == 1 ? u21Var.a[2].getText().toString() : "";
        if (obj == null) {
            obj = "";
        }
        a2.d = obj;
        String obj2 = u21Var.v == 1 ? u21Var.a[3].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.e = obj2;
        String obj3 = u21Var.v != 1 ? u21Var.a[4].getText().toString() : "";
        a2.f = obj3 != null ? obj3 : "";
        proxyInfo.settings = new ki.b(a2);
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        SharedPreferences.Editor edit = globalMainSettings.edit();
        if (z10) {
            SharedConfig.addProxy(proxyInfo);
            SharedConfig.currentProxy = proxyInfo;
            edit.putBoolean("proxy_enabled", true);
        } else {
            z11 = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedConfig.saveProxyList();
        }
        if (z10 || SharedConfig.currentProxy == proxyInfo) {
            proxyInfo.settings.f(edit);
            ConnectionsManager.setProxySettings(z11, proxyInfo.settings);
        }
        edit.commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        u21Var.finishFragment();
    }
}
