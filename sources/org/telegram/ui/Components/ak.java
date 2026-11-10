package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak implements org.telegram.messenger.v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk b;

    public /* synthetic */ ak(hk hkVar, int i7) {
        this.a = i7;
        this.b = hkVar;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                hk hkVar = this.b;
                TLRPC.User user = hkVar.r;
                if (!hkVar.K) {
                    hkVar.I = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        hkVar.J = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        hkVar.G = walletuseraddress.address;
                        hkVar.H = walletuseraddress.public_key;
                    }
                    hkVar.w.a(hkVar.G, user);
                    hkVar.i0();
                    hkVar.a0();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                hk hkVar2 = this.b;
                if (!hkVar2.K && wallettransaction != null) {
                    hkVar2.g0 = wallettransaction.fee;
                    hkVar2.j0();
                    break;
                }
                break;
        }
    }
}
