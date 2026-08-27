package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.bi1;
import org.telegram.ui.ci1;
import org.telegram.ui.nl0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gh(lh.d dVar, org.telegram.ui.ActionBar.e3 e3Var, int i10, View view, af.h hVar) {
        this.c = dVar;
        this.d = e3Var;
        this.b = i10;
        this.e = view;
        this.f = hVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.b2) this.c, (Utilities.Callback2) this.d, (v0.j) this.e, (Context) this.f, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                lh.d dVar = (lh.d) this.c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                View view = (View) this.e;
                af.h hVar = (af.h) this.f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        org.telegram.ui.Cells.pa.t(e3Var.topBulletinContainer, e3Var.getResourcesProvider(), tL_error, false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        int i10 = this.b;
                        int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                        StringBuilder p6 = com.google.android.recaptcha.internal.a.p("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                        p6.append(isTestBackend);
                        FileLog.d(p6.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = ci1.c(hVar, queryParameter, currentDatacenterId, isTestBackend);
                            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str = (String) hVar.c;
                            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                            j8.i0 i0Var = new j8.i0(t0Var, str, "/tg-wear-auth/token", c10);
                            t0Var.b.d(0, i0Var);
                            y5.l.n(i0Var, j8.k0.a).addOnSuccessListener(new nl0(29, hVar, dVar)).addOnFailureListener(new bi1(dVar, 1));
                            e3Var.dismiss();
                            break;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, e3Var.getResourcesProvider()).c0(e9.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ gh(org.telegram.ui.ActionBar.b2 b2Var, Utilities.Callback2 callback2, v0.j jVar, Context context, int i10) {
        this.c = b2Var;
        this.d = callback2;
        this.e = jVar;
        this.f = context;
        this.b = i10;
    }
}
