package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        char c10 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                n0 n0Var = (n0) obj4;
                v10 v10Var = (v10) obj3;
                String str = (String) obj2;
                byte[] bArr = (byte[]) obj;
                n0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    n0Var.M.put(str, walletuseraddress);
                    v10Var.a(walletuseraddress, null);
                    break;
                } else {
                    v10Var.a(null, null);
                    break;
                }
            case 1:
                f2 f2Var = (f2) obj4;
                b2 b2Var = (b2) obj3;
                li.c cVar = (li.c) obj2;
                String str2 = (String) obj;
                f2Var.getClass();
                b2Var.p = !b2Var.n && !f2Var.j(b2Var) && f2Var.A(b2Var) && str2 == null;
                cVar.a(null, str2);
                break;
            case 2:
                f2 f2Var2 = (f2) obj4;
                b2 b2Var2 = (b2) obj3;
                c20 c20Var = (c20) obj2;
                String str3 = (String) obj;
                f2Var2.getClass();
                b2Var2.m = false;
                if (b2Var2.r == null && f2Var2.g == b2Var2) {
                    f2Var2.g = null;
                }
                c20Var.a(str3);
                break;
            case 3:
                f2 f2Var3 = (f2) obj4;
                f2Var3.getClass();
                org.telegram.messenger.g0.h3(new g7((Object) f2Var3, obj3, (String) obj, obj2, 6));
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                di.r rVar = (di.r) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    rVar.a(wallettransaction2);
                    break;
                }
                break;
            case 5:
                a3[] a3VarArr = (a3[]) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                String str4 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str4)) {
                    new hc(a3VarArr[0].E, f6Var).e0(str4, false);
                    break;
                } else {
                    a3VarArr[0].dismiss();
                    break;
                }
            case 6:
                o8.d0((o8) obj4, (c20) obj3, (r0) obj2, (k0) obj);
                break;
            case 7:
                x9 x9Var = (x9) obj3;
                n0 n0Var2 = (n0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!x9Var.r) {
                    if (!TextUtils.isEmpty(str5) && n0.b(x9Var.f, n0Var2.t())) {
                        d0 d0Var = new d0(n0Var2, str5, x9Var.e, null, new r(x9Var, n0Var2, user, str5));
                        n0Var2.m0(d0Var);
                        x9Var.n = new l(d0Var, c10 == true ? 1 : 0);
                        break;
                    } else {
                        x9Var.h = false;
                        x9Var.Z.setLoading(false);
                        hc.a0(x9Var).e0(TextUtils.isEmpty(str5) ? hd.M0(2131743040, null) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Cells.g6) ((View) obj)).x((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                break;
            default:
                a3 a3Var = (a3) obj3;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                String str6 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (str6 != null) {
                    hc.c0(str6, a3Var.E, f6Var2);
                    break;
                } else {
                    a3Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ m(c20 c20Var, n0 n0Var, r0 r0Var, o8 o8Var) {
        this.a = 6;
        this.b = o8Var;
        this.c = c20Var;
        this.d = r0Var;
    }

    public /* synthetic */ m(x9 x9Var, n0 n0Var, TLRPC.User user) {
        this.a = 7;
        this.c = x9Var;
        this.b = n0Var;
        this.d = user;
    }
}
