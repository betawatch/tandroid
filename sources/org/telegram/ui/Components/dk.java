package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dk implements org.telegram.messenger.k20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kk b;

    public /* synthetic */ dk(kk kkVar, int i10) {
        this.a = i10;
        this.b = kkVar;
    }

    @Override // org.telegram.messenger.k20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                kk kkVar = this.b;
                TLRPC.User user = kkVar.r;
                if (!kkVar.K) {
                    kkVar.I = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        kkVar.J = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        kkVar.G = walletuseraddress.address;
                        kkVar.H = walletuseraddress.public_key;
                    }
                    kkVar.w.a(kkVar.G, user);
                    kkVar.g0();
                    kkVar.Y();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                kk kkVar2 = this.b;
                if (!kkVar2.K && wallettransaction != null) {
                    kkVar2.g0 = wallettransaction.fee;
                    kkVar2.h0();
                    break;
                }
                break;
        }
    }
}
