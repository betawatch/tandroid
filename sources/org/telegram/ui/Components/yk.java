package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl b;

    public /* synthetic */ yk(gl glVar, int i10) {
        this.a = i10;
        this.b = glVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                gl glVar = this.b;
                TLRPC.User user = glVar.r;
                if (!glVar.H) {
                    glVar.F = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        glVar.G = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        glVar.y = walletuseraddress.address;
                        glVar.E = walletuseraddress.public_key;
                    }
                    glVar.v.a(glVar.y, user);
                    glVar.g0();
                    glVar.Y();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                gl glVar2 = this.b;
                if (!glVar2.H && wallettransaction != null) {
                    glVar2.d0 = wallettransaction.fee;
                    glVar2.h0();
                    break;
                }
                break;
        }
    }
}
