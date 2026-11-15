package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9 b;

    public /* synthetic */ a9(p9 p9Var, int i7) {
        this.a = i7;
        this.b = p9Var;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                p9.g0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                p9 p9Var = this.b;
                p9Var.getClass();
                if (wallettransaction != null) {
                    p9Var.f0 = wallettransaction.fee;
                    p9Var.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                p9 p9Var2 = this.b;
                p9Var2.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    p9Var2.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        p9Var2.h = walletuseraddress.address;
                    }
                    bi.v3 v3Var = p9Var2.a;
                    if (v3Var != null) {
                        v3Var.g3.O(true);
                    }
                    p9Var2.C0();
                    p9Var2.t0();
                    s8 s8Var = p9Var2.w;
                    if (s8Var != null) {
                        s8Var.a(p9Var2.h, p9Var2.f);
                        break;
                    }
                } else {
                    p9Var2.finishFragment();
                    break;
                }
                break;
            case 3:
                p9 p9Var3 = this.b;
                p9Var3.h0 = (String) obj;
                p9Var3.i0 = ((Boolean) obj2).booleanValue();
                p9Var3.Q.setText(p9Var3.h0);
                p9Var3.Q.setVisibility(TextUtils.isEmpty(p9Var3.h0) ? 8 : 0);
                p9Var3.E0();
                break;
            default:
                p9 p9Var4 = this.b;
                p9Var4.h0 = (String) obj;
                p9Var4.i0 = ((Boolean) obj2).booleanValue();
                p9Var4.Q.setText(p9Var4.h0);
                p9Var4.Q.setVisibility(TextUtils.isEmpty(p9Var4.h0) ? 8 : 0);
                p9Var4.E0();
                break;
        }
    }
}
