package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.q10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                u0 u0Var = (u0) obj4;
                q10 q10Var = (q10) obj3;
                String str = (String) obj2;
                byte[] bArr = (byte[]) obj;
                u0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    u0Var.P.put(str, walletuseraddress);
                    q10Var.a(walletuseraddress, null);
                    break;
                } else {
                    q10Var.a(null, null);
                    break;
                }
            case 1:
                u0 u0Var2 = (u0) obj4;
                x10 x10Var = (x10) obj3;
                Runnable runnable = (Runnable) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (x10Var != null) {
                    u0Var2.q.put(wallettransaction, x10Var);
                }
                if (runnable == null) {
                    u0Var2.getClass();
                    break;
                } else {
                    u0Var2.r.put(wallettransaction, runnable);
                    break;
                }
            case 2:
                l2 l2Var = (l2) obj4;
                h2 h2Var = (h2) obj3;
                oi.c cVar = (oi.c) obj2;
                String str2 = (String) obj;
                l2Var.getClass();
                if (!h2Var.n && !l2Var.j(h2Var) && l2Var.A(h2Var) && str2 == null) {
                    z10 = true;
                }
                h2Var.p = z10;
                cVar.a(null, str2);
                break;
            case 3:
                l2 l2Var2 = (l2) obj4;
                h2 h2Var2 = (h2) obj3;
                x10 x10Var2 = (x10) obj2;
                String str3 = (String) obj;
                l2Var2.getClass();
                h2Var2.m = false;
                if (h2Var2.r == null && l2Var2.g == h2Var2) {
                    l2Var2.g = null;
                }
                x10Var2.a(str3);
                break;
            case 4:
                l2 l2Var3 = (l2) obj4;
                l2Var3.getClass();
                org.telegram.messenger.g0.g3(new v7((Object) l2Var3, obj3, (String) obj, obj2, 5));
                break;
            case 5:
                TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj4;
                fi.r rVar = (fi.r) obj3;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                TL_wallet.walletTransaction wallettransaction3 = (TL_wallet.walletTransaction) obj;
                if (wallettransaction3 != null) {
                    wallettransaction3.incoming = wallettransaction2.incoming;
                    wallettransaction3.peer = wallettransaction2.peer;
                    wallettransactionArr[0] = wallettransaction3;
                    rVar.a(wallettransaction3);
                    break;
                }
                break;
            case 6:
                e3[] e3VarArr = (e3[]) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                String str4 = (String) obj;
                ((hi.e) obj4).setLoading(false);
                if (!u0.L(str4)) {
                    if (!TextUtils.isEmpty(str4)) {
                        new lc(e3VarArr[0].F, h6Var).f0(str4, false);
                        break;
                    } else {
                        e3VarArr[0].dismiss();
                        break;
                    }
                }
                break;
            case 7:
                d9.f0((d9) obj4, (x10) obj3, (z0) obj2, (r0) obj);
                break;
            case 8:
                na naVar = (na) obj3;
                u0 u0Var3 = (u0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!naVar.r) {
                    if (!TextUtils.isEmpty(str5) && u0.c(naVar.f, u0Var3.y())) {
                        i0 i0Var = new i0(u0Var3, str5, naVar.e, null, new s(naVar, u0Var3, user, str5));
                        u0Var3.x0(i0Var);
                        naVar.n = new m(i0Var, 2);
                        break;
                    } else {
                        naVar.h = false;
                        naVar.a0.setLoading(false);
                        lc.b0(naVar).f0(TextUtils.isEmpty(str5) ? gd.N0(2131742775, null) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 9:
                ((org.telegram.ui.Cells.h6) ((View) obj)).x((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                break;
            default:
                e3 e3Var = (e3) obj3;
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj2;
                String str6 = (String) obj;
                ((hi.e) obj4).setLoading(false);
                if (str6 != null) {
                    lc.d0(str6, e3Var.F, h6Var2);
                    break;
                } else {
                    e3Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ o(x10 x10Var, u0 u0Var, z0 z0Var, d9 d9Var) {
        this.a = 7;
        this.b = d9Var;
        this.c = x10Var;
        this.d = z0Var;
    }

    public /* synthetic */ o(na naVar, u0 u0Var, TLRPC.User user) {
        this.a = 8;
        this.c = naVar;
        this.b = u0Var;
        this.d = user;
    }
}
