package org.telegram.messenger;

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.hh0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                org.telegram.ui.bx bxVar = (org.telegram.ui.bx) obj2;
                Activity activity = (Activity) obj;
                if (bxVar.getParentActivity() != null) {
                    bxVar.v2 = false;
                    boolean z11 = this.c;
                    boolean z12 = this.d;
                    if (z10 || z11 || z12) {
                        int i10 = 1;
                        bxVar.B0 = true;
                        if (!z10 || !hh0.K0(activity)) {
                            if (!z11 || !bxVar.W1 || !bxVar.getUserConfig().V || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z12 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    bxVar.u3(true);
                                    break;
                                } else if (activity instanceof org.telegram.ui.g5) {
                                    org.telegram.ui.ActionBar.t1 v = ((org.telegram.ui.g5) activity).v(R.raw.permission_request_folder, gd.N0(2131747105, null));
                                    bxVar.V1 = v;
                                    bxVar.showDialog(v);
                                    break;
                                }
                            } else {
                                org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.b5.v(activity, new org.telegram.ui.wu(bxVar, i10)).a;
                                bxVar.V1 = t1Var;
                                bxVar.showDialog(t1Var);
                                break;
                            }
                        } else {
                            c8.oa.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new org.telegram.ui.Components.bn(new org.telegram.ui.Components.ph(15, bxVar, activity), 1));
                            break;
                        }
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj2;
                p10 p10Var = (p10) obj;
                org.telegram.ui.Wallet.v0.P("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) v0Var.e;
                if (!v0Var.c.f(tL_walletState.public_key)) {
                    if (!tL_walletState.backup_enabled) {
                        org.telegram.ui.Wallet.v0.n("getSecretPhrase: no server backup!");
                        p10Var.a(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        org.telegram.ui.Wallet.v0.P("getSecretPhrase: exportSecretPhrase through password request");
                        org.telegram.ui.Wallet.o3.a(v0Var.a, new ci.y(9), null, null, null, new fi.b0(4, v0Var, p10Var), this.c, this.d, new m.b3(null, !z10 ? null : new org.telegram.ui.Wallet.v(v0Var, p10Var)));
                        break;
                    }
                } else {
                    org.telegram.ui.Wallet.v0.P("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.a1 a1Var = v0Var.c;
                    byte[] bArr = tL_walletState.public_key;
                    hi.fc fcVar = new hi.fc(v0Var, p10Var, z10, 5);
                    if (bArr == null) {
                        p10 = "";
                    } else {
                        a1Var.getClass();
                        p10 = org.telegram.ui.Wallet.a1.p(bArr);
                    }
                    org.telegram.ui.Wallet.a1.i.execute(new org.telegram.ui.Components.r2(a1Var, a1Var.l(), p10, true, (w10) fcVar));
                    break;
                }
        }
    }

    public /* synthetic */ k4(org.telegram.ui.bx bxVar, boolean z10, boolean z11, boolean z12, Activity activity) {
        this.a = 1;
        this.e = bxVar;
        this.b = z10;
        this.c = z11;
        this.d = z12;
        this.f = activity;
    }
}
