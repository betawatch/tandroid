package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qk implements org.telegram.messenger.q10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xk b;

    public /* synthetic */ qk(xk xkVar, int i7) {
        this.a = i7;
        this.b = xkVar;
    }

    @Override // org.telegram.messenger.q10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                xk xkVar = this.b;
                TLRPC.User user = xkVar.r;
                if (!xkVar.L) {
                    xkVar.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        xkVar.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        xkVar.H = walletuseraddress.address;
                        xkVar.I = walletuseraddress.public_key;
                    }
                    xkVar.w.a(xkVar.H, user);
                    xkVar.i0();
                    xkVar.a0();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                xk xkVar2 = this.b;
                if (!xkVar2.L && wallettransaction != null) {
                    xkVar2.h0 = wallettransaction.fee;
                    xkVar2.j0();
                    break;
                }
                break;
        }
    }
}
