package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class j21 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ o21 a;

    public j21(o21 o21Var) {
        this.a = o21Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        o21 o21Var = this.a;
        boolean z10 = o21Var.I;
        SharedConfig.ProxyInfo proxyInfo = o21Var.J;
        if (i10 == -1) {
            o21Var.finishFragment();
            return;
        }
        boolean z11 = true;
        if (i10 != 1 || o21Var.getParentActivity() == null) {
            return;
        }
        oi.a a2 = oi.b.a();
        int i11 = o21Var.v;
        if (i11 == 0) {
            i11 = 1;
        }
        a2.a = i11;
        String obj = o21Var.a[0].getText().toString();
        if (obj == null) {
            obj = "";
        }
        a2.b = obj;
        a2.c = o21Var.v == 3 ? 0 : Utilities.parseInt((CharSequence) o21Var.a[1].getText().toString()).intValue();
        String obj2 = o21Var.v == 1 ? o21Var.a[2].getText().toString() : "";
        if (obj2 == null) {
            obj2 = "";
        }
        a2.d = obj2;
        String obj3 = o21Var.v == 1 ? o21Var.a[3].getText().toString() : "";
        if (obj3 == null) {
            obj3 = "";
        }
        a2.e = obj3;
        String obj4 = o21Var.v != 1 ? o21Var.a[4].getText().toString() : "";
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
        o21Var.finishFragment();
    }
}
