package org.telegram.ui.Components;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk implements Utilities.Callback2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl b;

    public /* synthetic */ wk(dl dlVar, int i10) {
        this.a = i10;
        this.b = dlVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback2
    public final void run(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                TL_wallet.walletUserAddress walletuseraddress = (TL_wallet.walletUserAddress) obj;
                String str = (String) obj2;
                dl dlVar = this.b;
                TLRPC.User user = dlVar.r;
                if (!dlVar.H) {
                    dlVar.F = false;
                    if (TextUtils.equals(str, "WALLET_USER_UNAVAILABLE")) {
                        dlVar.G = true;
                    }
                    if (walletuseraddress != null && walletuseraddress.user_id == user.id) {
                        dlVar.y = walletuseraddress.address;
                        dlVar.E = walletuseraddress.public_key;
                    }
                    dlVar.v.a(dlVar.y, user);
                    dlVar.g0();
                    dlVar.Y();
                    break;
                }
                break;
            default:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                dl dlVar2 = this.b;
                if (!dlVar2.H && wallettransaction != null) {
                    dlVar2.d0 = wallettransaction.fee;
                    dlVar2.h0();
                    break;
                }
                break;
        }
    }
}
