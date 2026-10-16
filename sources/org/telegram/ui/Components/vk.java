package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cl b;

    public /* synthetic */ vk(cl clVar, int i10) {
        this.a = i10;
        this.b = clVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                cl clVar = this.b;
                TLRPC.User user = clVar.r;
                if (!clVar.H) {
                    clVar.F = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        clVar.G = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        clVar.y = walletuseraddress.address;
                        clVar.E = walletuseraddress.public_key;
                    }
                    clVar.v.a(clVar.y, user);
                    clVar.g0();
                    clVar.Y();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                cl clVar2 = this.b;
                if (!clVar2.H && wallettransaction != null) {
                    clVar2.d0 = wallettransaction.fee;
                    clVar2.h0();
                    break;
                }
                break;
        }
    }
}
