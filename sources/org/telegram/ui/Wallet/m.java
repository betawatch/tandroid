package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.bd;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        char c2 = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i3) {
            case 0:
                k0 k0Var = (k0) obj4;
                n10 n10Var = (n10) obj3;
                String str = (String) obj2;
                byte[] bArr = (byte[]) obj;
                k0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    k0Var.M.put(str, walletuseraddress);
                    n10Var.a(walletuseraddress, null);
                    break;
                } else {
                    n10Var.a(null, null);
                    break;
                }
            case 1:
                c2 c2Var = (c2) obj4;
                y1 y1Var = (y1) obj3;
                mi.c cVar = (mi.c) obj2;
                String str2 = (String) obj;
                c2Var.getClass();
                y1Var.p = !y1Var.n && !c2Var.j(y1Var) && c2Var.A(y1Var) && str2 == null;
                cVar.a(null, str2);
                break;
            case 2:
                c2 c2Var2 = (c2) obj4;
                y1 y1Var2 = (y1) obj3;
                u10 u10Var = (u10) obj2;
                String str3 = (String) obj;
                c2Var2.getClass();
                y1Var2.m = false;
                if (y1Var2.r == null && c2Var2.g == y1Var2) {
                    c2Var2.g = null;
                }
                u10Var.a(str3);
                break;
            case 3:
                c2 c2Var3 = (c2) obj4;
                c2Var3.getClass();
                org.telegram.messenger.g0.h3(new e7((Object) c2Var3, obj3, (String) obj, obj2, 6));
                break;
            case 4:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj4;
                ei.s sVar = (ei.s) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction2 != null) {
                    wallettransaction2.incoming = wallettransaction.incoming;
                    wallettransaction2.peer = wallettransaction.peer;
                    wallettransactionArr[0] = wallettransaction2;
                    sVar.a(wallettransaction2);
                    break;
                }
                break;
            case 5:
                y2[] y2VarArr = (y2[]) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                String str4 = (String) obj;
                ((gi.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str4)) {
                    new fc(y2VarArr[0].F, e6Var).e0(str4, false);
                    break;
                } else {
                    y2VarArr[0].dismiss();
                    break;
                }
            case 6:
                n8.d0((n8) obj4, (u10) obj3, (o0) obj2, (h0) obj);
                break;
            case 7:
                w9 w9Var = (w9) obj3;
                k0 k0Var2 = (k0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!w9Var.r) {
                    if (!TextUtils.isEmpty(str5) && k0.b(w9Var.f, k0Var2.t())) {
                        a0 a0Var = new a0(k0Var2, str5, w9Var.e, null, new q(w9Var, k0Var2, user, str5));
                        k0Var2.m0(a0Var);
                        w9Var.n = new l(a0Var, c2 == true ? 1 : 0);
                        break;
                    } else {
                        w9Var.h = false;
                        w9Var.a0.setLoading(false);
                        fc.a0(w9Var).e0(TextUtils.isEmpty(str5) ? bd.M0(2131743049, null) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Cells.f6) ((View) obj)).x((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                break;
            default:
                y2 y2Var = (y2) obj3;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj2;
                String str6 = (String) obj;
                ((gi.d) obj4).setLoading(false);
                if (str6 != null) {
                    fc.c0(str6, y2Var.F, e6Var2);
                    break;
                } else {
                    y2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ m(u10 u10Var, k0 k0Var, o0 o0Var, n8 n8Var) {
        this.a = 6;
        this.b = n8Var;
        this.c = u10Var;
        this.d = o0Var;
    }

    public /* synthetic */ m(w9 w9Var, k0 k0Var, TLRPC.User user) {
        this.a = 7;
        this.c = w9Var;
        this.b = k0Var;
        this.d = user;
    }
}
