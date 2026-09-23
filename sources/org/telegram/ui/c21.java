package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c21 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ h21 a;

    public c21(h21 h21Var) {
        this.a = h21Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        h21 h21Var = this.a;
        boolean z10 = h21Var.I;
        SharedConfig.ProxyInfo proxyInfo = h21Var.J;
        if (i10 == -1) {
            h21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || h21Var.getParentActivity() == null) {
            return;
        }
        ni.a a2 = ni.b.a();
        int i11 = h21Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = h21Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.b = obj;
        a2.c = h21Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) h21Var.a[1].getText().toString()).intValue();
        String obj2 = h21Var.v == 1 ? h21Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = h21Var.v == 1 ? h21Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = h21Var.v != 1 ? h21Var.a[4].getText().toString() : "";
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
        h21Var.finishFragment();
    }
}
