package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class u3 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new u3());
    }

    public static boolean i(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3 = wallettransaction instanceof t3 ? ((t3) wallettransaction).a : wallettransaction;
        TL_wallet.walletTransaction wallettransaction4 = wallettransaction2 instanceof t3 ? ((t3) wallettransaction2).a : wallettransaction2;
        return wallettransaction3 == wallettransaction4 || n0.i0(wallettransaction, wallettransaction2) || n0.i0(wallettransaction3, wallettransaction4);
    }

    @Override // org.telegram.ui.Components.q31
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        ((w3) view).g((TL_wallet.walletTransaction) r31Var.G, (v3) r31Var.H, z9);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean c(r31 r31Var, r31 r31Var2) {
        Object obj = r31Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = r31Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w3(i7, context, f6Var);
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean e(r31 r31Var, r31 r31Var2) {
        Object obj = r31Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = r31Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return i((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.q31
    public final boolean f() {
        return true;
    }
}
