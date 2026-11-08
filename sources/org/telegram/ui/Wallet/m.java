package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.hc;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                m0 m0Var = (m0) obj4;
                v10 v10Var = (v10) obj3;
                String str = (String) obj2;
                byte[] bArr = (byte[]) obj;
                m0Var.getClass();
                if (bArr != null) {
                    TL_wallet.walletUserAddress walletuseraddress = new TL_wallet.walletUserAddress();
                    walletuseraddress.user_id = 0L;
                    walletuseraddress.address = str;
                    walletuseraddress.public_key = bArr;
                    m0Var.M.put(str, walletuseraddress);
                    v10Var.a(walletuseraddress, null);
                    break;
                } else {
                    v10Var.a(null, null);
                    break;
                }
            case 1:
                e2 e2Var = (e2) obj4;
                a2 a2Var = (a2) obj3;
                li.c cVar = (li.c) obj2;
                String str2 = (String) obj;
                e2Var.getClass();
                a2Var.p = !a2Var.n && !e2Var.j(a2Var) && e2Var.A(a2Var) && str2 == null;
                cVar.a(null, str2);
                break;
            case 2:
                e2 e2Var2 = (e2) obj4;
                a2 a2Var2 = (a2) obj3;
                c20 c20Var = (c20) obj2;
                String str3 = (String) obj;
                e2Var2.getClass();
                a2Var2.m = false;
                if (a2Var2.r == null && e2Var2.g == a2Var2) {
                    e2Var2.g = null;
                }
                c20Var.a(str3);
                break;
            case 3:
                e2 e2Var3 = (e2) obj4;
                e2Var3.getClass();
                org.telegram.messenger.g0.h3(new f7((Object) e2Var3, obj3, (String) obj, obj2, 6));
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
                z2[] z2VarArr = (z2[]) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                String str4 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (!TextUtils.isEmpty(str4)) {
                    new hc(z2VarArr[0].E, f6Var).e0(str4, false);
                    break;
                } else {
                    z2VarArr[0].dismiss();
                    break;
                }
            case 6:
                n8.d0((n8) obj4, (c20) obj3, (q0) obj2, (j0) obj);
                break;
            case 7:
                w9 w9Var = (w9) obj3;
                m0 m0Var2 = (m0) obj4;
                TLRPC.User user = (TLRPC.User) obj2;
                String str5 = (String) obj;
                if (!w9Var.r) {
                    if (!TextUtils.isEmpty(str5) && m0.b(w9Var.f, m0Var2.t())) {
                        c0 c0Var = new c0(m0Var2, str5, w9Var.e, null, new r(w9Var, m0Var2, user, str5));
                        m0Var2.m0(c0Var);
                        w9Var.n = new l(c0Var, c10 == true ? 1 : 0);
                        break;
                    } else {
                        w9Var.h = false;
                        w9Var.Z.setLoading(false);
                        hc.a0(w9Var).e0(TextUtils.isEmpty(str5) ? id.M0(2131743042, null) : "WALLET_CHANGED", false);
                        break;
                    }
                }
                break;
            case 8:
                ((org.telegram.ui.Cells.g6) ((View) obj)).x((TLRPC.User) obj4, null, (CharSequence) obj3, (CharSequence) obj2, false, false);
                break;
            default:
                z2 z2Var = (z2) obj3;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj2;
                String str6 = (String) obj;
                ((fi.d) obj4).setLoading(false);
                if (str6 != null) {
                    hc.c0(str6, z2Var.E, f6Var2);
                    break;
                } else {
                    z2Var.dismiss();
                    break;
                }
        }
    }

    public /* synthetic */ m(c20 c20Var, m0 m0Var, q0 q0Var, n8 n8Var) {
        this.a = 6;
        this.b = n8Var;
        this.c = c20Var;
        this.d = q0Var;
    }

    public /* synthetic */ m(w9 w9Var, m0 m0Var, TLRPC.User user) {
        this.a = 7;
        this.c = w9Var;
        this.b = m0Var;
        this.d = user;
    }
}
