package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                l0 l0Var = (l0) obj4;
                v10 v10Var = (v10) obj3;
                String str = (String) obj2;
                byte[] bArr = (byte[]) obj;
                l0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    l0Var.M.put(str, walletuseraddress);
                    v10Var.a(walletuseraddress, null);
                    break;
                } else {
                    v10Var.a(null, null);
                    break;
                }
            case 1:
                d2 d2Var = (d2) obj4;
                z1 z1Var = (z1) obj3;
                li.c cVar = (li.c) obj2;
                String str2 = (String) obj;
                d2Var.getClass();
                z1Var.p = !z1Var.n && !d2Var.j(z1Var) && d2Var.A(z1Var) && str2 == null;
                cVar.a(null, str2);
                break;
            case 2:
                d2 d2Var2 = (d2) obj4;
                z1 z1Var2 = (z1) obj3;
                c20 c20Var = (c20) obj2;
                String str3 = (String) obj;
                d2Var2.getClass();
                z1Var2.m = false;
                if (z1Var2.r == null && d2Var2.g == z1Var2) {
                    d2Var2.g = null;
                }
                c20Var.a(str3);
                break;
            case 3:
                d2 d2Var3 = (d2) obj4;
                d2Var3.getClass();
                org.telegram.messenger.g0.h3(new e7((Object) d2Var3, obj3, (String) obj, obj2, 6));
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
                y2[] y2VarArr = (y2[]) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                String str4 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str4)) {
                    new hc(y2VarArr[0].E, g6Var).e0(str4, false);
                    break;
                } else {
                    y2VarArr[0].dismiss();
                    break;
                }
            case 6:
                m8.d0((m8) obj4, (c20) obj3, (p0) obj2, (i0) obj);
                break;
            case 7:
                v9 v9Var = (v9) obj3;
                l0 l0Var2 = (l0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!v9Var.r) {
                    if (!TextUtils.isEmpty(str5) && l0.b(v9Var.f, l0Var2.t())) {
                        b0 b0Var = new b0(l0Var2, str5, v9Var.e, null, new q(v9Var, l0Var2, user, str5));
                        l0Var2.m0(b0Var);
                        v9Var.n = new l(b0Var, c10 == true ? 1 : 0);
                        break;
                    } else {
                        v9Var.h = false;
                        v9Var.Z.setLoading(false);
                        hc.a0(v9Var).e0(TextUtils.isEmpty(str5) ? id.M0(2131743039, null) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Cells.g6) ((View) obj)).x((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                break;
            default:
                y2 y2Var = (y2) obj3;
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj2;
                String str6 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (str6 != null) {
                    hc.c0(str6, y2Var.E, g6Var2);
                    break;
                } else {
                    y2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ m(c20 c20Var, l0 l0Var, p0 p0Var, m8 m8Var) {
        this.a = 6;
        this.b = m8Var;
        this.c = c20Var;
        this.d = p0Var;
    }

    public /* synthetic */ m(v9 v9Var, l0 l0Var, TLRPC.User user) {
        this.a = 7;
        this.c = v9Var;
        this.b = l0Var;
        this.d = user;
    }
}
