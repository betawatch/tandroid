package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class d21 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProxyListActivity b;

    public d21(ProxyListActivity proxyListActivity, Context context) {
        this.b = proxyListActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ProxyListActivity proxyListActivity = this.b;
        ArrayList arrayList = proxyListActivity.F;
        if (i10 == -1) {
            if (arrayList.isEmpty()) {
                proxyListActivity.finishFragment();
                return;
            } else {
                proxyListActivity.a.F();
                return;
            }
        }
        int i11 = 1;
        if (i10 == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.a.T = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteProxyMultiConfirm : R.string.DeleteProxyConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ol0(this, 15));
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            proxyListActivity.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
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
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
            if (sb2.length() > 0) {
                sb2.append("\n\n");
            }
            oi.b bVar = proxyInfo.settings;
            String str = bVar.e;
            String str2 = bVar.d;
            String str3 = bVar.b;
            String str4 = bVar.f;
            int i13 = bVar.a;
            int c10 = m1.j.c(i13);
            StringBuilder sb3 = c10 != i11 ? c10 != 2 ? new StringBuilder("https://t.me/socks?") : new StringBuilder("https://t.me/webproxy?") : new StringBuilder("https://t.me/proxy?");
            try {
                sb3.append("server=");
                sb3.append(URLEncoder.encode(str3, "UTF-8"));
                if (i13 != 3) {
                    sb3.append("&port=");
                    sb3.append(bVar.c);
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb3.append("&user=");
                    sb3.append(URLEncoder.encode(str2, "UTF-8"));
                }
                if (!TextUtils.isEmpty(str)) {
                    sb3.append("&pass=");
                    sb3.append(URLEncoder.encode(str, "UTF-8"));
                }
                if (!TextUtils.isEmpty(str4)) {
                    if (i13 == 3) {
                        if ((str3 != null && str3.indexOf(47) >= 0) && oi.b.g(str4)) {
                            int length = str4.length() / 2;
                            byte[] bArr = new byte[length];
                            for (int i14 = 0; i14 < length; i14++) {
                                int i15 = i14 * 2;
                                bArr[i14] = (byte) (Character.digit(str4.charAt(i15 + 1), 16) | (Character.digit(str4.charAt(i15), 16) << 4));
                            }
                            byte[] bArr2 = new byte[length + 1];
                            bArr2[0] = 112;
                            System.arraycopy(bArr, 0, bArr2, 1, length);
                            str4 = Base64.encodeToString(bArr2, 11);
                        }
                    }
                    sb3.append("&secret=");
                    sb3.append(URLEncoder.encode(str4, "UTF-8"));
                }
            } catch (UnsupportedEncodingException unused) {
            }
            sb2.append(sb3.toString());
            i11 = 1;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", sb2.toString());
        Intent createChooser = Intent.createChooser(intent, LocaleController.getString(arrayList.size() > 1 ? R.string.ShareLinks : R.string.ShareLink));
        createChooser.setFlags(TLObject.FLAG_28);
        this.a.startActivity(createChooser);
        e21 e21Var = proxyListActivity.a;
        if (e21Var != null) {
            e21Var.F();
        }
    }
}
