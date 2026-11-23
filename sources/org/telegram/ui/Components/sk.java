package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zk b;

    public /* synthetic */ sk(zk zkVar, int i7) {
        this.a = i7;
        this.b = zkVar;
    }

    @Override // org.telegram.messenger.r10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                zk zkVar = this.b;
                TLRPC.User user = zkVar.r;
                if (!zkVar.L) {
                    zkVar.J = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        zkVar.K = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        zkVar.H = walletuseraddress.address;
                        zkVar.I = walletuseraddress.public_key;
                    }
                    zkVar.w.a(zkVar.H, user);
                    zkVar.i0();
                    zkVar.a0();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                zk zkVar2 = this.b;
                if (!zkVar2.L && wallettransaction != null) {
                    zkVar2.h0 = wallettransaction.fee;
                    zkVar2.j0();
                    break;
                }
                break;
        }
    }
}
