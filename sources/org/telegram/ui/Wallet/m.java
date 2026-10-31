package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        int i10 = this.a;
        char c10 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj4;
                j20 j20Var = (j20) obj3;
                String str = (String) obj2;
                byte[] bArr = (byte[]) obj;
                k0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    k0Var.M.put(str, walletuseraddress);
                    j20Var.a(walletuseraddress, null);
                    break;
                } else {
                    j20Var.a(null, null);
                    break;
                }
            case 1:
                e2 e2Var = (e2) obj4;
                a2 a2Var = (a2) obj3;
                bi.d dVar = (bi.d) obj2;
                String str2 = (String) obj;
                e2Var.getClass();
                a2Var.p = !a2Var.n && !e2Var.j(a2Var) && e2Var.A(a2Var) && str2 == null;
                dVar.a(null, str2);
                break;
            case 2:
                e2 e2Var2 = (e2) obj4;
                a2 a2Var2 = (a2) obj3;
                q20 q20Var = (q20) obj2;
                String str3 = (String) obj;
                e2Var2.getClass();
                a2Var2.m = false;
                if (a2Var2.r == null && e2Var2.g == a2Var2) {
                    e2Var2.g = null;
                }
                q20Var.a(str3);
                break;
            case 3:
                e2 e2Var3 = (e2) obj4;
                e2Var3.getClass();
                org.telegram.messenger.i0.g3(new k7((Object) e2Var3, obj3, (String) obj, obj2, 6));
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                q4 q4Var = (q4) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    q4Var.a(wallettransaction2);
                    break;
                }
                break;
            case 5:
                z2[] z2VarArr = (z2[]) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                String str4 = (String) obj;
                ((vh.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str4)) {
                    new cc(z2VarArr[0].E, p6Var).e0(str4, false);
                    break;
                } else {
                    z2VarArr[0].dismiss();
                    break;
                }
            case 6:
                t8.c0((t8) obj4, (q20) obj3, (p0) obj2, (h0) obj);
                break;
            case 7:
                ba baVar = (ba) obj3;
                k0 k0Var2 = (k0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!baVar.r) {
                    if (!TextUtils.isEmpty(str5) && k0.b(baVar.f, k0Var2.t())) {
                        a0 a0Var = new a0(k0Var2, str5, baVar.e, null, new q(baVar, k0Var2, user, str5));
                        k0Var2.m0(a0Var);
                        baVar.n = new l(a0Var, c10 == true ? 1 : 0);
                        break;
                    } else {
                        baVar.h = false;
                        baVar.Z.setLoading(false);
                        cc.a0(baVar).e0(TextUtils.isEmpty(str5) ? cd.L0(2131743065, null) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Cells.k6) ((View) obj)).z((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                break;
            default:
                z2 z2Var = (z2) obj3;
                org.telegram.ui.ActionBar.p6 p6Var2 = (org.telegram.ui.ActionBar.p6) obj2;
                String str6 = (String) obj;
                ((vh.d) obj4).setLoading(false);
                if (str6 != null) {
                    cc.c0(str6, z2Var.E, p6Var2);
                    break;
                } else {
                    z2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ m(q20 q20Var, k0 k0Var, p0 p0Var, t8 t8Var) {
        this.a = 6;
        this.b = t8Var;
        this.c = q20Var;
        this.d = p0Var;
    }

    public /* synthetic */ m(ba baVar, k0 k0Var, TLRPC.User user) {
        this.a = 7;
        this.c = baVar;
        this.b = k0Var;
        this.d = user;
    }
}
