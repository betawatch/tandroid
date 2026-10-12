package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q21 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ v21 a;

    public q21(v21 v21Var) {
        this.a = v21Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        v21 v21Var = this.a;
        boolean z10 = v21Var.I;
        SharedConfig.ProxyInfo proxyInfo = v21Var.J;
        if (i10 == -1) {
            v21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || v21Var.getParentActivity() == null) {
            return;
        }
        k2.p0 a2 = qi.a.a();
        int i11 = v21Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = v21Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.c = obj;
        a2.b = v21Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) v21Var.a[1].getText().toString()).intValue();
        String obj2 = v21Var.v == 1 ? v21Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = v21Var.v == 1 ? v21Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = v21Var.v != 1 ? v21Var.a[4].getText().toString() : "";
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
        v21Var.finishFragment();
    }
}
