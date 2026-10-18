package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class p11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ u11 a;

    public p11(u11 u11Var) {
        this.a = u11Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        u11 u11Var = this.a;
        boolean z10 = u11Var.I;
        SharedConfig.ProxyInfo proxyInfo = u11Var.J;
        if (i10 == -1) {
            u11Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || u11Var.getParentActivity() == null) {
            return;
        }
        k2.q0 a2 = qi.a.a();
        int i11 = u11Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = u11Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.c = obj;
        a2.b = u11Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) u11Var.a[1].getText().toString()).intValue();
        String obj2 = u11Var.v == 1 ? u11Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = u11Var.v == 1 ? u11Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = u11Var.v != 1 ? u11Var.a[4].getText().toString() : "";
        a2.f = obj4 != null ? obj4 : "";
        proxyInfo.settings = a2.b();
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
        u11Var.finishFragment();
    }
}
