// default package

import android.app.Activity;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fv2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fv2(nk3 nk3Var, boolean z, boolean z2, boolean z3, Activity activity) {
        this.a = (byte) 1;
        this.e = nk3Var;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.f = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String p;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                bw2 bw2Var = (bw2) obj2;
                HashMap hashMap = (HashMap) obj;
                if (e21.a) {
                    fc4.b("sync contacts by alert");
                }
                bw2Var.F(hashMap, true, this.b, this.c, false, false, this.d);
                break;
            case 1:
                nk3 nk3Var = (nk3) obj2;
                Activity activity = (Activity) obj;
                if (nk3Var.getParentActivity() != null) {
                    nk3Var.v2 = false;
                    boolean z2 = this.c;
                    boolean z3 = this.d;
                    if (z || z2 || z3) {
                        byte b2 = 1;
                        nk3Var.B0 = true;
                        if (!z || !wn7.E0(activity)) {
                            if (!z2 || !nk3Var.W1 || !nk3Var.getUserConfig().V || !activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                                if (!z3 || !activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                    nk3Var.C2(true);
                                    break;
                                } else if (activity instanceof th0) {
                                    he x = ((th0) activity).x(R.raw.permission_request_folder, jb6.M0(2131747032, null));
                                    nk3Var.V1 = x;
                                    nk3Var.showDialog(x);
                                    break;
                                }
                            } else {
                                he heVar = ik.v(activity, new ci3(nk3Var, b2)).a;
                                nk3Var.V1 = heVar;
                                nk3Var.showDialog(heVar);
                                break;
                            }
                        } else {
                            use.e(new String[]{"android.permission.POST_NOTIFICATIONS"}, new h72(new qy1((Object) nk3Var, (Object) activity, (byte) 13), (byte) 3));
                            break;
                        }
                    }
                }
                break;
            default:
                c cVar = (c) obj2;
                jac jacVar = (jac) obj;
                c.O("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                byte b3 = 2;
                if (!cVar.c.f(tL_walletState.public_key)) {
                    if (!tL_walletState.backup_enabled) {
                        c.m("getSecretPhrase: no server backup!");
                        jacVar.a(null, "NO_LOCAL_BACKUP");
                        break;
                    } else {
                        c.O("getSecretPhrase: exportSecretPhrase through password request");
                        e08.a(cVar.a, new pb((byte) 5), null, null, null, new qp0(cVar, jacVar, b3), this.c, this.d, new s34((qn4) null, !z ? null : new c25(cVar, jacVar)));
                        break;
                    }
                } else {
                    c.O("getSecretPhrase: device has secured phrase, requesting");
                    g35 g35Var = cVar.c;
                    byte[] bArr = tL_walletState.public_key;
                    z52 z52Var = new z52(cVar, jacVar, z, b3);
                    if (bArr == null) {
                        p = "";
                    } else {
                        g35Var.getClass();
                        p = g35.p(bArr);
                    }
                    g35.i.execute(new qf2(g35Var, g35Var.l(), p, true, (qac) z52Var));
                    break;
                }
        }
    }

    public /* synthetic */ fv2(Object obj, Object obj2, boolean z, boolean z2, boolean z3, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }
}
