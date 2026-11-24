// default package

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class k0c extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new k0c());
    }

    public static c6c i(TL_wallet.walletTransaction wallettransaction, l0c l0cVar) {
        c6c K = c6c.K(k0c.class);
        j0c j0cVar = new j0c(wallettransaction);
        j0cVar.set(wallettransaction);
        j0cVar.id = wallettransaction.id;
        j0cVar.random_id = wallettransaction.random_id;
        j0cVar.gasless = wallettransaction.gasless;
        j0cVar.gaslessMessageBodyHash = wallettransaction.gaslessMessageBodyHash;
        j0cVar.normalMessageBodyHash = wallettransaction.normalMessageBodyHash;
        j0cVar.nft = wallettransaction.nft;
        K.H = j0cVar;
        K.I = l0cVar;
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        K.m = walletTransactionPeer == null ? null : l0cVar.a(walletTransactionPeer.address);
        return K;
    }

    public static boolean j(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3 = wallettransaction instanceof j0c ? ((j0c) wallettransaction).a : wallettransaction;
        TL_wallet.walletTransaction wallettransaction4 = wallettransaction2 instanceof j0c ? ((j0c) wallettransaction2).a : wallettransaction2;
        return wallettransaction3 == wallettransaction4 || c.t0(wallettransaction, wallettransaction2) || c.t0(wallettransaction3, wallettransaction4);
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((m0c) view).h((TL_wallet.walletTransaction) c6cVar.H, (l0c) c6cVar.I, z);
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        Object obj = c6cVar.H;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = c6cVar2.H;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new m0c(i, ylbVar, context);
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        Object obj = c6cVar.H;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = c6cVar2.H;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return j((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // b6c
    public final boolean f() {
        return true;
    }
}
