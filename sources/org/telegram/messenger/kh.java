package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.jj1;
import org.telegram.ui.kj1;
import org.telegram.ui.tv0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class kh implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ kh(ci.d dVar, org.telegram.ui.ActionBar.g3 g3Var, int i10, View view, cf.c cVar) {
        this.c = dVar;
        this.d = g3Var;
        this.b = i10;
        this.e = view;
        this.f = cVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.c2) this.c, (Utilities.Callback2) this.d, (l5.j) this.e, (Context) this.f, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                ci.d dVar = (ci.d) this.c;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.d;
                View view = (View) this.e;
                cf.c cVar = (cf.c) this.f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.vc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        org.telegram.ui.Cells.p6.q(g3Var.topBulletinContainer, g3Var.getResourcesProvider(), tL_error, false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.vc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        int i10 = this.b;
                        int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                        StringBuilder m10 = hg.k0.m("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                        m10.append(isTestBackend);
                        FileLog.d(m10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = kj1.c(cVar, queryParameter, currentDatacenterId, isTestBackend);
                            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str = (String) cVar.d;
                            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                            b8.e eVar = new b8.e(t0Var, str, "/tg-wear-auth/token", c10);
                            t0Var.b.d(0, eVar);
                            n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new tv0(19, cVar, dVar)).addOnFailureListener(new jj1(dVar, 1));
                            g3Var.dismiss();
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            new org.telegram.ui.Components.vc(g3Var.topBulletinContainer, g3Var.getResourcesProvider()).c0(e.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ kh(org.telegram.ui.ActionBar.c2 c2Var, Utilities.Callback2 callback2, l5.j jVar, Context context, int i10) {
        this.c = c2Var;
        this.d = callback2;
        this.e = jVar;
        this.f = context;
        this.b = i10;
    }
}
