package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProxyListActivity b;

    public a11(ProxyListActivity proxyListActivity, Context context) {
        this.b = proxyListActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        ProxyListActivity proxyListActivity = this.b;
        ArrayList arrayList = proxyListActivity.D;
        if (i9 == -1) {
            if (arrayList.isEmpty()) {
                proxyListActivity.finishFragment();
                return;
            } else {
                proxyListActivity.a.F();
                return;
            }
        }
        int i10 = 0;
        if (i9 == 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
            alertDialog$Builder.a.P = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteProxyMultiConfirm : R.string.DeleteProxyConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new dl0(this, 14));
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
            proxyListActivity.showDialog(c2Var);
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
                return;
            }
            return;
        }
        if (i9 != 1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
            if (sb2.length() > 0) {
                sb2.append("\n\n");
            }
            sb2.append(proxyInfo.getLink());
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", sb2.toString());
        Intent createChooser = Intent.createChooser(intent, LocaleController.getString(arrayList.size() > 1 ? R.string.ShareLinks : R.string.ShareLink));
        createChooser.setFlags(TLObject.FLAG_28);
        this.a.startActivity(createChooser);
        b11 b11Var = proxyListActivity.a;
        if (b11Var != null) {
            b11Var.F();
        }
    }
}
