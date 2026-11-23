package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.r10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p9 implements r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ p9(da daVar, int i7) {
        this.a = i7;
        this.b = daVar;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                da.g0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                da daVar = this.b;
                daVar.getClass();
                if (wallettransaction != null) {
                    daVar.f0 = wallettransaction.fee;
                    daVar.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                da daVar2 = this.b;
                daVar2.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    daVar2.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        daVar2.h = walletuseraddress.address;
                    }
                    bi.f6 f6Var = daVar2.a;
                    if (f6Var != null) {
                        f6Var.g3.O(true);
                    }
                    daVar2.C0();
                    daVar2.t0();
                    g9 g9Var = daVar2.w;
                    if (g9Var != null) {
                        g9Var.a(daVar2.h, daVar2.f);
                        break;
                    }
                } else {
                    daVar2.finishFragment();
                    break;
                }
                break;
            case 3:
                da daVar3 = this.b;
                daVar3.h0 = (String) obj;
                daVar3.i0 = ((Boolean) obj2).booleanValue();
                daVar3.Q.setText(daVar3.h0);
                daVar3.Q.setVisibility(TextUtils.isEmpty(daVar3.h0) ? 8 : 0);
                daVar3.E0();
                break;
            default:
                da daVar4 = this.b;
                daVar4.h0 = (String) obj;
                daVar4.i0 = ((Boolean) obj2).booleanValue();
                daVar4.Q.setText(daVar4.h0);
                daVar4.Q.setVisibility(TextUtils.isEmpty(daVar4.h0) ? 8 : 0);
                daVar4.E0();
                break;
        }
    }
}
