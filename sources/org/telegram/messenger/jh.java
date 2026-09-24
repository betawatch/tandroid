package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.cj1;
import org.telegram.ui.dj1;
import org.telegram.ui.ds0;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final /* synthetic */ class jh implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jh(ci.d dVar, org.telegram.ui.ActionBar.e3 e3Var, int i10, View view, cf.c cVar) {
        this.c = dVar;
        this.d = e3Var;
        this.b = i10;
        this.e = view;
        this.f = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.a2) this.c, (Utilities.Callback2) this.d, (q2.b) this.e, (Context) this.f, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ci.d dVar = (ci.d) this.c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                View view = (View) this.e;
                cf.c cVar = (cf.c) this.f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.yc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        org.telegram.ui.Cells.c1.r(e3Var.topBulletinContainer, e3Var.getResourcesProvider(), tL_error, false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.yc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        int i10 = this.b;
                        int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                        StringBuilder k10 = hg.c.k("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                        k10.append(isTestBackend);
                        FileLog.d(k10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = dj1.c(cVar, queryParameter, currentDatacenterId, isTestBackend);
                            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str = (String) cVar.d;
                            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                            b8.e eVar = new b8.e(t0Var, str, "/tg-wear-auth/token", c10);
                            t0Var.b.d(0, eVar);
                            n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new ds0(21, cVar, dVar)).addOnFailureListener(new cj1(dVar, 1));
                            e3Var.dismiss();
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            new org.telegram.ui.Components.yc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0(e.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ jh(org.telegram.ui.ActionBar.a2 a2Var, Utilities.Callback2 callback2, q2.b bVar, Context context, int i10) {
        this.c = a2Var;
        this.d = callback2;
        this.e = bVar;
        this.f = context;
        this.b = i10;
    }
}
