package bi;

import android.content.Context;
import android.os.SystemClock;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z3 implements p10 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ z3(int i7, org.telegram.ui.Wallet.v0 v0Var, org.telegram.ui.Wallet.e3 e3Var, org.telegram.ui.Wallet.z2 z2Var, String str, byte[] bArr, byte[] bArr2, org.telegram.ui.ActionBar.i6 i6Var) {
        this.c = i7;
        this.f = v0Var;
        this.b = z2Var;
        this.e = str;
        this.d = bArr;
        this.g = bArr2;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        int i7 = this.a;
        Object obj3 = this.g;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.f;
        switch (i7) {
            case 0:
                Runnable runnable = (Runnable) obj6;
                Context context = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj4;
                kc kcVar = (kc) obj3;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                HashMap hashMap = l4.c;
                String str = this.e;
                int i10 = this.c;
                if (updates == null) {
                    hashMap.remove(str);
                    l4.c();
                    a5.r(context, i10, i6Var, kcVar, tL_error, null);
                    break;
                } else {
                    hashMap.put(str, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
                    l4.c();
                    mp.u1(i10).V3(updates, false);
                    if (runnable != null) {
                        runnable.run();
                    }
                    fc Q = l4.h().Q(R.raw.contact_check, 36, gd.N0(2131749601, null));
                    Q.t = true;
                    Q.j();
                    break;
                }
            case 1:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj6;
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj4;
                di.k1 k1Var = (di.k1) obj3;
                org.telegram.ui.Wallet.q0 q0Var = (org.telegram.ui.Wallet.q0) obj;
                Boolean bool = (Boolean) obj2;
                q0Var.h = new TL_wallet.walletOnchainGiftActionDelist();
                q0Var.i = tL_starGiftUnique;
                int i11 = this.c;
                u3 u3Var = new u3(i11, context2, tL_starGiftUnique, i6Var2);
                String str2 = this.e;
                u3Var.k1(gd.N0(bool.booleanValue() ? 2131749512 : 2131749513, null), gd.a0(null, null, 2131749869, str2));
                u3Var.Z1.e(gd.N0(2131749539, null), a5.i(q0Var.b), null, null);
                u3Var.d2.i(gd.N0(2131750415, null), false, true);
                u3Var.q2 = 2131749614;
                u3Var.j1(q0Var);
                u3Var.i1(new ai.x0(k1Var, tL_starGiftUnique, str2, i11, 1), new ai.s1(3, tL_starGiftUnique, str2), new n4(context2, i11, i6Var2, u3Var, bool, 0));
                u3Var.show();
                break;
            default:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) obj6;
                org.telegram.ui.Wallet.z2 z2Var = (org.telegram.ui.Wallet.z2) obj5;
                byte[] bArr = (byte[]) obj4;
                byte[] bArr2 = (byte[]) obj3;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                String str3 = (String) obj2;
                if (!z2Var.e || z2Var.d) {
                    if (sendtransfer != null) {
                        int i12 = this.c;
                        ConnectionsManager.getInstance(i12).sendRequestTyped(sendtransfer, new d3.b(1), new p4(i12, v0Var, this.e, bArr, bArr2, sendtransfer, z2Var));
                        break;
                    } else {
                        if (str3 == null) {
                            str3 = gd.N0(2131742715, null);
                        }
                        kc.c0(str3);
                        z2Var.d = false;
                        if (!z2Var.f) {
                            z2Var.f = true;
                            z2Var.b.a();
                        }
                        if (!z2Var.e) {
                            z2Var.a.dismiss();
                            break;
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ z3(String str, int i7, Runnable runnable, Context context, org.telegram.ui.ActionBar.i6 i6Var, kc kcVar) {
        this.e = str;
        this.c = i7;
        this.f = runnable;
        this.b = context;
        this.d = i6Var;
        this.g = kcVar;
    }

    public /* synthetic */ z3(TL_stars.TL_starGiftUnique tL_starGiftUnique, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, String str, di.k1 k1Var) {
        this.f = tL_starGiftUnique;
        this.b = context;
        this.c = i7;
        this.d = i6Var;
        this.e = str;
        this.g = k1Var;
    }
}
