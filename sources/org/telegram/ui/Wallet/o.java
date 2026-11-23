package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.messenger.p10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class o implements w10 {
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

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        boolean z10 = false;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i7) {
            case 0:
                v0 v0Var = (v0) obj4;
                p10 p10Var = (p10) obj3;
                String str = (String) obj2;
                byte[] bArr = (byte[]) obj;
                v0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    v0Var.P.put(str, walletuseraddress);
                    p10Var.a(walletuseraddress, null);
                    break;
                } else {
                    p10Var.a(null, null);
                    break;
                }
            case 1:
                v0 v0Var2 = (v0) obj4;
                w10 w10Var = (w10) obj3;
                Runnable runnable = (Runnable) obj2;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                if (w10Var != null) {
                    v0Var2.q.put(wallettransaction, w10Var);
                }
                if (runnable == null) {
                    v0Var2.getClass();
                    break;
                } else {
                    v0Var2.r.put(wallettransaction, runnable);
                    break;
                }
            case 2:
                m2 m2Var = (m2) obj4;
                i2 i2Var = (i2) obj3;
                oi.c cVar = (oi.c) obj2;
                String str2 = (String) obj;
                m2Var.getClass();
                if (!i2Var.n && !m2Var.j(i2Var) && m2Var.A(i2Var) && str2 == null) {
                    z10 = true;
                }
                i2Var.p = z10;
                cVar.a(null, str2);
                break;
            case 3:
                m2 m2Var2 = (m2) obj4;
                i2 i2Var2 = (i2) obj3;
                w10 w10Var2 = (w10) obj2;
                String str3 = (String) obj;
                m2Var2.getClass();
                i2Var2.m = false;
                if (i2Var2.r == null && m2Var2.g == i2Var2) {
                    m2Var2.g = null;
                }
                w10Var2.a(str3);
                break;
            case 4:
                m2 m2Var3 = (m2) obj4;
                m2Var3.getClass();
                org.telegram.messenger.g0.g3(new w7((Object) m2Var3, obj3, (String) obj, obj2, 5));
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
                f3[] f3VarArr = (f3[]) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                String str4 = (String) obj;
                ((hi.e) obj4).setLoading(false);
                if (!v0.L(str4)) {
                    if (!TextUtils.isEmpty(str4)) {
                        new kc(f3VarArr[0].F, i6Var).f0(str4, false);
                        break;
                    } else {
                        f3VarArr[0].dismiss();
                        break;
                    }
                }
                break;
            case 7:
                e9.f0((e9) obj4, (w10) obj3, (a1) obj2, (s0) obj);
                break;
            case 8:
                oa oaVar = (oa) obj3;
                v0 v0Var3 = (v0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!oaVar.r) {
                    if (!TextUtils.isEmpty(str5) && v0.c(oaVar.f, v0Var3.y())) {
                        j0 j0Var = new j0(v0Var3, str5, oaVar.e, null, new t(oaVar, v0Var3, user, str5));
                        v0Var3.x0(j0Var);
                        oaVar.n = new m(j0Var, 2);
                        break;
                    } else {
                        oaVar.h = false;
                        oaVar.a0.setLoading(false);
                        kc.b0(oaVar).f0(TextUtils.isEmpty(str5) ? gd.N0(2131742768, null) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 9:
                ((org.telegram.ui.Cells.g6) ((View) obj)).z((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                break;
            default:
                f3 f3Var = (f3) obj3;
                org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) obj2;
                String str6 = (String) obj;
                ((hi.e) obj4).setLoading(false);
                if (str6 != null) {
                    kc.d0(str6, f3Var.F, i6Var2);
                    break;
                } else {
                    f3Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ o(w10 w10Var, v0 v0Var, a1 a1Var, e9 e9Var) {
        this.a = 7;
        this.b = e9Var;
        this.c = w10Var;
        this.d = a1Var;
    }

    public /* synthetic */ o(oa oaVar, v0 v0Var, TLRPC.User user) {
        this.a = 8;
        this.c = oaVar;
        this.b = v0Var;
        this.d = user;
    }
}
