package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ci1;
import org.telegram.ui.di1;
import org.telegram.ui.nl0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ch implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ch(kh.d dVar, org.telegram.ui.ActionBar.f3 f3Var, int i9, View view, b3.b bVar) {
        this.c = dVar;
        this.d = f3Var;
        this.b = i9;
        this.e = view;
        this.f = bVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.c2) this.c, (Utilities.Callback2) this.d, (g6.b) this.e, (Context) this.f, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                kh.d dVar = (kh.d) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                View view = (View) this.e;
                b3.b bVar = (b3.b) this.f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        org.telegram.ui.Cells.j2.s(f3Var.topBulletinContainer, f3Var.getResourcesProvider(), tL_error, false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        int i9 = this.b;
                        int currentDatacenterId = ConnectionsManager.getInstance(i9).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i9).isTestBackend();
                        StringBuilder o6 = e2.c.o("wear-auth: sending /token account=", i9, " dcId=", currentDatacenterId, " isTest=");
                        o6.append(isTestBackend);
                        FileLog.d(o6.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = di1.c(bVar, queryParameter, currentDatacenterId, isTestBackend);
                            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str = (String) bVar.c;
                            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                            i8.j0 j0Var = new i8.j0(t0Var, str, "/tg-wear-auth/token", c10);
                            t0Var.b.d(0, j0Var);
                            x5.l.n(j0Var, i8.l0.a).addOnSuccessListener(new nl0(29, bVar, dVar)).addOnFailureListener(new ci1(dVar, 1));
                            f3Var.dismiss();
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            new org.telegram.ui.Components.oc(f3Var.topBulletinContainer, f3Var.getResourcesProvider()).c0(e10.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ ch(org.telegram.ui.ActionBar.c2 c2Var, Utilities.Callback2 callback2, g6.b bVar, Context context, int i9) {
        this.c = c2Var;
        this.d = callback2;
        this.e = bVar;
        this.f = context;
        this.b = i9;
    }
}
