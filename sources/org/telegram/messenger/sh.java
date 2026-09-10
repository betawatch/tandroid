package org.telegram.messenger;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.fz0;
import org.telegram.ui.oj1;
import org.telegram.ui.pj1;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class sh implements Utilities.Callback2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sh(bi.d dVar, org.telegram.ui.ActionBar.h3 h3Var, int i10, View view, bi.u6 u6Var) {
        this.c = dVar;
        this.d = h3Var;
        this.b = i10;
        this.e = view;
        this.f = u6Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                PasskeysController.lambda$create$9((org.telegram.ui.ActionBar.d2) this.c, (Utilities.Callback2) this.d, (androidx.biometric.s) this.e, (Context) this.f, this.b, (TL_account.passkeyRegistrationOptions) obj, (TLRPC.TL_error) obj2);
                break;
            default:
                bi.d dVar = (bi.d) this.c;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.d;
                View view = (View) this.e;
                bi.u6 u6Var = (bi.u6) this.f;
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                dVar.setLoading(false);
                if (!(urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted)) {
                    if (tL_error == null) {
                        new org.telegram.ui.Components.wc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        org.telegram.ui.Cells.r6.q(h3Var.topBulletinContainer, h3Var.getResourcesProvider(), tL_error, false);
                        break;
                    }
                } else {
                    String queryParameter = Uri.parse("?" + Uri.parse(((TLRPC.TL_urlAuthResultAccepted) urlAuthResult).url).getFragment()).getQueryParameter("tgWebAuthToken");
                    if (queryParameter == null) {
                        new org.telegram.ui.Components.wc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0("NO_TOKEN", false);
                        break;
                    } else {
                        int i10 = this.b;
                        int currentDatacenterId = ConnectionsManager.getInstance(i10).getCurrentDatacenterId();
                        boolean isTestBackend = ConnectionsManager.getInstance(i10).isTestBackend();
                        StringBuilder n10 = hc.b.n("wear-auth: sending /token account=", i10, " dcId=", currentDatacenterId, " isTest=");
                        n10.append(isTestBackend);
                        FileLog.d(n10.toString());
                        Context applicationContext = view.getContext().getApplicationContext();
                        try {
                            byte[] c10 = pj1.c(u6Var, queryParameter, currentDatacenterId, isTestBackend);
                            com.google.android.gms.internal.clearcut.v0 v0Var = new com.google.android.gms.internal.clearcut.v0(applicationContext, com.google.android.gms.common.api.i.c);
                            String str = (String) u6Var.c;
                            com.google.android.gms.common.api.internal.t0 t0Var = v0Var.h;
                            b8.e eVar = new b8.e(t0Var, str, "/tg-wear-auth/token", c10);
                            t0Var.b.d(0, eVar);
                            n6.l.n(eVar, y8.j0.a).addOnSuccessListener(new fz0(15, u6Var, dVar)).addOnFailureListener(new oj1(dVar, 1));
                            h3Var.dismiss();
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            new org.telegram.ui.Components.wc(h3Var.topBulletinContainer, h3Var.getResourcesProvider()).c0(e.getMessage(), false);
                            return;
                        }
                    }
                }
        }
    }

    public /* synthetic */ sh(org.telegram.ui.ActionBar.d2 d2Var, Utilities.Callback2 callback2, androidx.biometric.s sVar, Context context, int i10) {
        this.c = d2Var;
        this.d = callback2;
        this.e = sVar;
        this.f = context;
        this.b = i10;
    }
}
