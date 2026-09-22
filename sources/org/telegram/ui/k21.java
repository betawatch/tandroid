package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class k21 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ p21 a;

    public k21(p21 p21Var) {
        this.a = p21Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        p21 p21Var = this.a;
        boolean z10 = p21Var.I;
        SharedConfig.ProxyInfo proxyInfo = p21Var.J;
        if (i10 == -1) {
            p21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || p21Var.getParentActivity() == null) {
            return;
        }
        ni.a a2 = ni.b.a();
        int i11 = p21Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = p21Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.b = obj;
        a2.c = p21Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) p21Var.a[1].getText().toString()).intValue();
        String obj2 = p21Var.v == 1 ? p21Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = p21Var.v == 1 ? p21Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = p21Var.v != 1 ? p21Var.a[4].getText().toString() : "";
        a2.f = obj4 != null ? obj4 : "";
        proxyInfo.settings = a2.a();
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
            proxyInfo.settings.h(edit);
            ConnectionsManager.setProxySettings(z11, proxyInfo.settings);
        }
        edit.commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        p21Var.finishFragment();
    }
}
