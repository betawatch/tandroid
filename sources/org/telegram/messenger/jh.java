package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.di1;
import org.telegram.ui.ei1;
import org.telegram.ui.kl0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class jh implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ jh(nh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i10, View view, a5.j jVar) {
        this.c = dVar;
        this.d = f3Var;
        this.b = i10;
        this.e = view;
        this.f = jVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.c2) this.c, (Utilities.Callback2) this.d, (w5.h) this.e, (Context) this.f, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                nh.d dVar = (nh.d) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                View view = (View) this.e;
                a5.j jVar = (a5.j) this.f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        org.telegram.ui.th.t(f3Var.topBulletinContainer, f3Var.getResourcesProvider(), tL_error, false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        int i10 = this.b;
                        int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                        o10.append(isTestBackend);
                        FileLog.d(o10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c3 = ei1.c(jVar, queryParameter, currentDatacenterId, isTestBackend);
                            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str = (String) jVar.c;
                            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                            k8.j0 j0Var = new k8.j0(t0Var, str, "/tg-wear-auth/token", c3);
                            t0Var.b.d(0, j0Var);
                            z5.l.n(j0Var, k8.l0.a).addOnSuccessListener(new kl0(29, jVar, dVar)).addOnFailureListener(new di1(dVar, 1));
                            f3Var.dismiss();
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            new org.telegram.ui.Components.tc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(e10.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ jh(org.telegram.ui.ActionBar.c2 c2Var, Utilities.Callback2 callback2, w5.h hVar, Context context, int i10) {
        this.c = c2Var;
        this.d = callback2;
        this.e = hVar;
        this.f = context;
        this.b = i10;
    }
}
