package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class i21 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ n21 a;

    public i21(n21 n21Var) {
        this.a = n21Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        n21 n21Var = this.a;
        boolean z10 = n21Var.I;
        SharedConfig.ProxyInfo proxyInfo = n21Var.J;
        if (i10 == -1) {
            n21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || n21Var.getParentActivity() == null) {
            return;
        }
        oi.a a2 = oi.b.a();
        int i11 = n21Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = n21Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.b = obj;
        a2.c = n21Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) n21Var.a[1].getText().toString()).intValue();
        String obj2 = n21Var.v == 1 ? n21Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = n21Var.v == 1 ? n21Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = n21Var.v != 1 ? n21Var.a[4].getText().toString() : "";
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
        n21Var.finishFragment();
    }
}
