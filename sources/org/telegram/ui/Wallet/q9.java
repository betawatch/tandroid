package org.telegram.ui.Wallet;

import android.text.TextUtils;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class q9 implements p10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ea b;

    public /* synthetic */ q9(ea eaVar, int i7) {
        this.a = i7;
        this.b = eaVar;
    }

    @Override // org.telegram.messenger.p10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ea.g0(this.b, (TL_wallet.walletUserAddress) obj);
                break;
            case 1:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ea eaVar = this.b;
                eaVar.getClass();
                if (wallettransaction != null) {
                    eaVar.f0 = wallettransaction.fee;
                    eaVar.D0();
                    break;
                }
                break;
            case 2:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                ea eaVar2 = this.b;
                eaVar2.r = false;
                if (!TextUtils.equals((String) obj2, "WALLET_USER_UNAVAILABLE")) {
                    eaVar2.e = walletuseraddress;
                    if (walletuseraddress != null) {
                        eaVar2.h = walletuseraddress.address;
                    }
                    bi.i6 i6Var = eaVar2.a;
                    if (i6Var != null) {
                        i6Var.g3.O(true);
                    }
                    eaVar2.C0();
                    eaVar2.t0();
                    h9 h9Var = eaVar2.w;
                    if (h9Var != null) {
                        h9Var.a(eaVar2.h, eaVar2.f);
                        break;
                    }
                } else {
                    eaVar2.finishFragment();
                    break;
                }
                break;
            case 3:
                ea eaVar3 = this.b;
                eaVar3.h0 = (String) obj;
                eaVar3.i0 = ((Boolean) obj2).booleanValue();
                eaVar3.Q.setText(eaVar3.h0);
                eaVar3.Q.setVisibility(TextUtils.isEmpty(eaVar3.h0) ? 8 : 0);
                eaVar3.E0();
                break;
            default:
                ea eaVar4 = this.b;
                eaVar4.h0 = (String) obj;
                eaVar4.i0 = ((Boolean) obj2).booleanValue();
                eaVar4.Q.setText(eaVar4.h0);
                eaVar4.Q.setVisibility(TextUtils.isEmpty(eaVar4.h0) ? 8 : 0);
                eaVar4.E0();
                break;
        }
    }
}
