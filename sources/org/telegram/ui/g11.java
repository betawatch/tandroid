package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ j11 a;

    public g11(j11 j11Var) {
        this.a = j11Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        boolean z10;
        j11 j11Var = this.a;
        boolean z11 = j11Var.F;
        SharedConfig.ProxyInfo proxyInfo = j11Var.G;
        if (i10 == -1) {
            j11Var.finishFragment();
            return;
        }
        if (i10 != 1 || j11Var.getParentActivity() == null) {
            return;
        }
        proxyInfo.address = j11Var.a[0].getText().toString();
        proxyInfo.port = Utilities.parseInt((CharSequence) j11Var.a[1].getText().toString()).intValue();
        if (j11Var.v == 0) {
            proxyInfo.secret = "";
            proxyInfo.username = j11Var.a[2].getText().toString();
            proxyInfo.password = j11Var.a[3].getText().toString();
        } else {
            proxyInfo.secret = j11Var.a[4].getText().toString();
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
        j11Var.finishFragment();
    }
}
