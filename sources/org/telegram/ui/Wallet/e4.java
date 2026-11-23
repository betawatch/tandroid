package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e4 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new e4());
    }

    public static n41 i(TL_wallet.walletTransaction wallettransaction, f4 f4Var) {
        n41 K = n41.K(e4.class);
        d4 d4Var = new d4(wallettransaction);
        d4Var.set(wallettransaction);
        d4Var.id = wallettransaction.id;
        d4Var.random_id = wallettransaction.random_id;
        d4Var.gasless = wallettransaction.gasless;
        d4Var.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
        d4Var.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
        d4Var.nft = wallettransaction.nft;
        K.H = d4Var;
        K.I = f4Var;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        K.m = walletTransactionPeer == null ? null : f4Var.a(walletTransactionPeer.address);
        return K;
    }

    public static boolean j(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3 = wallettransaction instanceof d4 ? ((d4) wallettransaction).a : wallettransaction;
        TL_wallet.walletTransaction wallettransaction4 = wallettransaction2 instanceof d4 ? ((d4) wallettransaction2).a : wallettransaction2;
        return wallettransaction3 == wallettransaction4 || v0.t0(wallettransaction, wallettransaction2) || v0.t0(wallettransaction3, wallettransaction4);
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ((g4) view).h((TL_wallet.walletTransaction) n41Var.H, (f4) n41Var.I, z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean c(n41 n41Var, n41 n41Var2) {
        Object obj = n41Var.H;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = n41Var2.H;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new g4(i7, context, i6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean e(n41 n41Var, n41 n41Var2) {
        Object obj = n41Var.H;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = n41Var2.H;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return j((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean f() {
        return true;
    }
}
