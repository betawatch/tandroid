package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebProxyTransport;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class g11 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ l11 a;

    public g11(l11 l11Var) {
        this.a = l11Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        boolean z10;
        l11 l11Var = this.a;
        SharedConfig.ProxyInfo proxyInfo = l11Var.G;
        if (i10 == -1) {
            l11Var.finishFragment();
            return;
        }
        if (i10 != 1 || l11Var.getParentActivity() == null) {
            return;
        }
        proxyInfo.address = l11Var.v == 2 ? WebProxyTransport.normalizeHost(l11Var.a[0].getText().toString()) : l11Var.a[0].getText().toString();
        proxyInfo.port = l11Var.v == 2 ? 443 : Utilities.parseInt((CharSequence) l11Var.a[1].getText().toString()).intValue();
        int i11 = l11Var.v;
        proxyInfo.type = i11;
        if (i11 == 0) {
            proxyInfo.secret = "";
            proxyInfo.username = l11Var.a[2].getText().toString();
            proxyInfo.password = l11Var.a[3].getText().toString();
        } else {
            proxyInfo.secret = l11Var.a[4].getText().toString();
            proxyInfo.username = "";
            proxyInfo.password = "";
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        SharedPreferences.Editor edit = globalMainSettings.edit();
        if (l11Var.F) {
            SharedConfig.addProxy(proxyInfo);
            SharedConfig.currentProxy = proxyInfo;
            edit.putBoolean("proxy_enabled", true);
            z10 = true;
        } else {
            boolean z11 = globalMainSettings.getBoolean("proxy_enabled", false);
            SharedConfig.saveProxyList();
            z10 = z11;
        }
        if (l11Var.F || SharedConfig.currentProxy == proxyInfo) {
            edit.putString("proxy_ip", proxyInfo.address);
            edit.putString("proxy_pass", proxyInfo.password);
            edit.putString("proxy_user", proxyInfo.username);
            edit.putInt("proxy_port", proxyInfo.port);
            edit.putString("proxy_secret", proxyInfo.secret);
            edit.putInt("proxy_type", proxyInfo.type);
            ConnectionsManager.setProxySettings(z10, proxyInfo.address, proxyInfo.port, proxyInfo.username, proxyInfo.password, proxyInfo.secret, proxyInfo.type);
        }
        edit.commit();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
        l11Var.finishFragment();
    }
}
