package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ti1;
import org.telegram.ui.ui1;
import org.telegram.ui.vl0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final /* synthetic */ class mh implements Utilities.Callback2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mh(org.telegram.ui.ActionBar.d2 d2Var, Utilities.Callback2 callback2, k6.b bVar, Context context, int i10) {
        this.c = d2Var;
        this.d = callback2;
        this.e = bVar;
        this.f = context;
        this.b = i10;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.d2) this.c, (Utilities.Callback2) this.d, (k6.b) this.e, (Context) this.f, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                qh.d dVar = (qh.d) this.c;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.d;
                View view = (View) this.e;
                c5.j jVar = (c5.j) this.f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        org.telegram.ui.yh.u(h3Var.topBulletinContainer, h3Var.getResourcesProvider(), tL_error, false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        int i10 = this.b;
                        int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                        StringBuilder m9 = e2.c.m("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                        m9.append(isTestBackend);
                        FileLog.d(m9.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c3 = ui1.c(jVar, queryParameter, currentDatacenterId, isTestBackend);
                            a8.e eVar = new a8.e(applicationContext, com.google.android.gms.common.api.i.c);
                            String str = (String) jVar.c;
                            com.google.android.gms.common.api.internal.t0 t0Var = eVar.h;
                            m8.i0 i0Var = new m8.i0(t0Var, str, "/tg-wear-auth/token", c3);
                            t0Var.b.d(0, i0Var);
                            b6.m.n(i0Var, m8.k0.a).addOnSuccessListener(new vl0(28, jVar, dVar)).addOnFailureListener(new ti1(dVar, 1));
                            h3Var.dismiss();
                            break;
                        } catch (Exception e6) {
                            FileLog.e(e6);
                            new org.telegram.ui.Components.qc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(e6.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ mh(qh.d dVar, org.telegram.ui.ActionBar.h3 h3Var, int i10, View view, c5.j jVar) {
        this.c = dVar;
        this.d = h3Var;
        this.b = i10;
        this.e = view;
        this.f = jVar;
    }
}
