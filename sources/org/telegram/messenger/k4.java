package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ih0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class k4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k4(Object obj, Object obj2, boolean z10, boolean z11, boolean z12, int i7) {
        this.a = i7;
        this.e = obj;
        this.f = obj2;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String p10;
        int i7 = this.a;
        boolean z10 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i7) {
            case 0:
                i5 i5Var = (i5) obj2;
                HashMap hashMap = (HashMap) obj;
                if (s2.a) {
                    a8.b("sync contacts by alert");
                }
                i5Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                break;
            case 1:
                org.telegram.ui.cx cxVar = (org.telegram.ui.cx) obj2;
                Activity activity = (Activity) obj;
                if (cxVar.getParentActivity() != null) {
                    cxVar.v2 = false;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        int i10 = 1;
                        cxVar.B0 = true;
                        if (!z10 || !ih0.K0(activity)) {
                            if (!z11 || !cxVar.W1 || !cxVar.getUserConfig().V || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    cxVar.u3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.g5) {
                                    org.telegram.ui.ActionBar.u1 v = ((org.telegram.ui.g5) activity).v(R.raw.permission_request_folder, gd.M0(2131747106, null));
                                    cxVar.V1 = v;
                                    cxVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.b5.v(activity, new org.telegram.ui.xu(cxVar, i10)).a;
                                cxVar.V1 = u1Var;
                                cxVar.showDialog(u1Var);
                                break;
                            }
                        } else {
                            c8.na.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.bn(new org.telegram.ui.Components.ph(14, cxVar, activity), 1));
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) obj2;
                q10 q10Var = (q10) obj;
                org.telegram.ui.Wallet.u0.P("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) u0Var.e;
                if (!u0Var.c.f(tL_walletState.public_key)) {
                    if (!tL_walletState.backup_enabled) {
                        org.telegram.ui.Wallet.u0.n("getSecretPhrase: no server backup!");
                        q10Var.a(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.u0.P("getSecretPhrase: exportSecretPhrase through password request");
                        org.telegram.ui.Wallet.n3.a(u0Var.a, new ci.y(9), null, null, null, new fi.b0(4, u0Var, q10Var), this.c, this.d, new m.b3(null, !z10 ? null : new org.telegram.ui.Wallet.u(u0Var, q10Var)));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.u0.P("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.z0 z0Var = u0Var.c;
                    byte[] bArr = tL_walletState.public_key;
                    hi.lb lbVar = new hi.lb(u0Var, q10Var, z10, 5);
                    if (bArr == null) {
                        p10 = "";
                    } else {
                        z0Var.getClass();
                        p10 = org.telegram.ui.Wallet.z0.p(bArr);
                    }
                    org.telegram.ui.Wallet.z0.i.execute(new org.telegram.ui.Components.r2(z0Var, z0Var.l(), p10, true, (x10) lbVar));
                    break;
                }
        }
    }

    public /* synthetic */ k4(org.telegram.ui.cx cxVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.a = 1;
        this.e = cxVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
