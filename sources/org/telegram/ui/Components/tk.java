package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class tk implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ al b;

    public /* synthetic */ tk(al alVar, int i10) {
        this.a = i10;
        this.b = alVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                al alVar = this.b;
                TLRPC.User user = alVar.r;
                if (!alVar.K) {
                    alVar.I = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        alVar.J = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        alVar.G = walletuseraddress.address;
                        alVar.H = walletuseraddress.public_key;
                    }
                    alVar.v.a(alVar.G, user);
                    alVar.g0();
                    alVar.Y();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                al alVar2 = this.b;
                if (!alVar2.K && wallettransaction != null) {
                    alVar2.g0 = wallettransaction.fee;
                    alVar2.h0();
                    break;
                }
                break;
        }
    }
}
