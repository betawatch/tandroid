package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class f11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ k11 a;

    public f11(k11 k11Var) {
        this.a = k11Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        boolean z10;
        k11 k11Var = this.a;
        boolean z11 = k11Var.F;
        SharedConfig.ProxyInfo proxyInfo = k11Var.G;
        if (i9 == -1) {
            k11Var.finishFragment();
            return;
        }
        if (i9 != 1 || k11Var.getParentActivity() == null) {
            return;
        }
        proxyInfo.address = k11Var.a[0].getText().toString();
        proxyInfo.port = Utilities.parseInt((CharSequence) k11Var.a[1].getText().toString()).intValue();
        if (k11Var.v == 0) {
            proxyInfo.secret = "";
            proxyInfo.username = k11Var.a[2].getText().toString();
            proxyInfo.password = k11Var.a[3].getText().toString();
        } else {
            proxyInfo.secret = k11Var.a[4].getText().toString();
            proxyInfo.username = "";
            proxyInfo.password = "";
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        SharedPreferences.Editor edit = globalMainSettings.edit();
        if (z11) {
            SharedConfig.addProxy(proxyInfo);
            SharedConfig.currentProxy = proxyInfo;
            edit.putBoolean("proxy_enabled", true);
            z10 = true;
        } else {
            boolean z12 = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedConfig.saveProxyList();
            z10 = z12;
        }
        if (z11 || SharedConfig.currentProxy == proxyInfo) {
            edit.putString("proxy_ip", proxyInfo.address);
            edit.putString("proxy_pass", proxyInfo.password);
            edit.putString("proxy_user", proxyInfo.username);
            edit.putInt("proxy_port", proxyInfo.port);
            edit.putString("proxy_secret", proxyInfo.secret);
            ConnectionsManager.setProxySettings(z10, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret);
        }
        edit.commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        k11Var.finishFragment();
    }
}
