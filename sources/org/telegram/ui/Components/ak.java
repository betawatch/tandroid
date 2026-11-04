package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak implements org.telegram.messenger.n10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hk b;

    public /* synthetic */ ak(hk hkVar, int i3) {
        this.a = i3;
        this.b = hkVar;
    }

    @Override // org.telegram.messenger.n10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                hk hkVar = this.b;
                TLRPC.User user = hkVar.r;
                if (!hkVar.L) {
                    hkVar.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        hkVar.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        hkVar.H = walletuseraddress.address;
                        hkVar.I = walletuseraddress.public_key;
                    }
                    hkVar.w.a(hkVar.H, user);
                    hkVar.i0();
                    hkVar.a0();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                hk hkVar2 = this.b;
                if (!hkVar2.L && wallettransaction != null) {
                    hkVar2.h0 = wallettransaction.fee;
                    hkVar2.j0();
                    break;
                }
                break;
        }
    }
}
