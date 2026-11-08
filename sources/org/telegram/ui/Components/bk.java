package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bk implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ik b;

    public /* synthetic */ bk(ik ikVar, int i7) {
        this.a = i7;
        this.b = ikVar;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                ik ikVar = this.b;
                TLRPC.User user = ikVar.r;
                if (!ikVar.K) {
                    ikVar.I = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        ikVar.J = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        ikVar.G = walletuseraddress.address;
                        ikVar.H = walletuseraddress.public_key;
                    }
                    ikVar.w.a(ikVar.G, user);
                    ikVar.i0();
                    ikVar.a0();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                ik ikVar2 = this.b;
                if (!ikVar2.K && wallettransaction != null) {
                    ikVar2.g0 = wallettransaction.fee;
                    ikVar2.j0();
                    break;
                }
                break;
        }
    }
}
