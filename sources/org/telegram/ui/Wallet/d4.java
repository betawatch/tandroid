package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class d4 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new d4());
    }

    public static o41 i(TL_wallet.walletTransaction wallettransaction, e4 e4Var) {
        o41 K = o41.K(d4.class);
        c4 c4Var = new c4(wallettransaction);
        c4Var.set(wallettransaction);
        c4Var.id = wallettransaction.id;
        c4Var.random_id = wallettransaction.random_id;
        c4Var.gasless = wallettransaction.gasless;
        c4Var.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
        c4Var.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
        c4Var.nft = wallettransaction.nft;
        K.H = c4Var;
        K.I = e4Var;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        K.m = walletTransactionPeer == null ? null : e4Var.a(walletTransactionPeer.address);
        return K;
    }

    public static boolean j(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3 = wallettransaction instanceof c4 ? ((c4) wallettransaction).a : wallettransaction;
        TL_wallet.walletTransaction wallettransaction4 = wallettransaction2 instanceof c4 ? ((c4) wallettransaction2).a : wallettransaction2;
        return wallettransaction3 == wallettransaction4 || u0.t0(wallettransaction, wallettransaction2) || u0.t0(wallettransaction3, wallettransaction4);
    }

    @Override // org.telegram.ui.Components.n41
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        ((f4) view).h((TL_wallet.walletTransaction) o41Var.H, (e4) o41Var.I, z10);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean c(o41 o41Var, o41 o41Var2) {
        Object obj = o41Var.H;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = o41Var2.H;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new f4(i7, context, h6Var);
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean e(o41 o41Var, o41 o41Var2) {
        Object obj = o41Var.H;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = o41Var2.H;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return j((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.n41
    public final boolean f() {
        return true;
    }
}
