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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m11 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ProxyListActivity b;

    public m11(ProxyListActivity proxyListActivity, Context context) {
        this.b = proxyListActivity;
        this.a = context;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ProxyListActivity proxyListActivity = this.b;
        ArrayList arrayList = proxyListActivity.E;
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
            alertDialog$Builder.a.Q = LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteProxyMultiConfirm : R.string.DeleteProxyConfirm);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.DeleteProxyTitle);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new il0(this, 14));
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
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            SharedConfig.ProxyInfo proxyInfo = (SharedConfig.ProxyInfo) obj;
            if (sb.length() > 0) {
                sb.append("\n\n");
            }
            sb.append(proxyInfo.getLink());
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", sb.toString());
        Intent createChooser = Intent.createChooser(intent, LocaleController.getString(arrayList.size() > 1 ? R.string.ShareLinks : R.string.ShareLink));
        createChooser.setFlags(TLObject.FLAG_28);
        this.a.startActivity(createChooser);
        n11 n11Var = proxyListActivity.a;
        if (n11Var != null) {
            n11Var.F();
        }
    }
}
