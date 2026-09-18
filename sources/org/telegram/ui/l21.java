package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l21 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ q21 a;

    public l21(q21 q21Var) {
        this.a = q21Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        q21 q21Var = this.a;
        boolean z10 = q21Var.I;
        SharedConfig.ProxyInfo proxyInfo = q21Var.J;
        if (i10 == -1) {
            q21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || q21Var.getParentActivity() == null) {
            return;
        }
        ni.a a2 = ni.b.a();
        int i11 = q21Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = q21Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.b = obj;
        a2.c = q21Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) q21Var.a[1].getText().toString()).intValue();
        String obj2 = q21Var.v == 1 ? q21Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = q21Var.v == 1 ? q21Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = q21Var.v != 1 ? q21Var.a[4].getText().toString() : "";
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
        q21Var.finishFragment();
    }
}
