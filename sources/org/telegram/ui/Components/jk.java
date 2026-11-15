package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jk implements org.telegram.messenger.s10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk b;

    public /* synthetic */ jk(qk qkVar, int i7) {
        this.a = i7;
        this.b = qkVar;
    }

    @Override // org.telegram.messenger.s10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                qk qkVar = this.b;
                TLRPC.User user = qkVar.r;
                if (!qkVar.L) {
                    qkVar.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        qkVar.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        qkVar.H = walletuseraddress.address;
                        qkVar.I = walletuseraddress.public_key;
                    }
                    qkVar.w.a(qkVar.H, user);
                    qkVar.i0();
                    qkVar.a0();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                qk qkVar2 = this.b;
                if (!qkVar2.L && wallettransaction != null) {
                    qkVar2.h0 = wallettransaction.fee;
                    qkVar2.j0();
                    break;
                }
                break;
        }
    }
}
