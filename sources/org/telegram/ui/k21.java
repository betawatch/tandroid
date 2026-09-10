package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k21 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProxyListActivity b;

    public k21(ProxyListActivity proxyListActivity, Context context) {
        this.b = proxyListActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        ProxyListActivity proxyListActivity = this.b;
        ArrayList arrayList = proxyListActivity.H;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                proxyListActivity.finishFragment();
                return;
            } else {
                proxyListActivity.a.F();
                return;
            }
        }
        int i11 = 0;
        if (i10 == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.a.T = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteProxyMultiConfirm : R.string.DeleteProxyConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ul0(this, 14));
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
            proxyListActivity.showDialog(d2Var);
            TextView textView = (TextView) d2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
                return;
            }
            return;
        }
        if (i10 != 1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
            if (sb2.length() > 0) {
                sb2.append("\n\n");
            }
            ki.b bVar = proxyInfo.settings;
            String str = bVar.f;
            String str2 = bVar.e;
            String str3 = bVar.d;
            int i12 = bVar.a;
            int c10 = m1.j.c(i12);
            StringBuilder sb3 = c10 != 1 ? c10 != 2 ? new StringBuilder("https://t.me/socks?") : new StringBuilder("https://t.me/webproxy?") : new StringBuilder("https://t.me/proxy?");
            try {
                sb3.append("server=");
                sb3.append(URLEncoder.encode(bVar.b, "UTF-8"));
                if (i12 != 3) {
                    sb3.append("&port=");
                    sb3.append(bVar.c);
                }
                if (!TextUtils.isEmpty(str3)) {
                    sb3.append("&user=");
                    sb3.append(URLEncoder.encode(str3, "UTF-8"));
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb3.append("&pass=");
                    sb3.append(URLEncoder.encode(str2, "UTF-8"));
                }
                if (!TextUtils.isEmpty(str)) {
                    sb3.append("&secret=");
                    sb3.append(URLEncoder.encode(str, "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            sb2.append(sb3.toString());
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", sb2.toString());
        Intent createChooser = Intent.createChooser(intent, LocaleController.getString(arrayList.size() > 1 ? R.string.ShareLinks : R.string.ShareLink));
        createChooser.setFlags(TLObject.FLAG_28);
        this.a.startActivity(createChooser);
        l21 l21Var = proxyListActivity.a;
        if (l21Var != null) {
            l21Var.F();
        }
    }
}
