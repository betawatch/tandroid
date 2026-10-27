package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class d3 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new d3());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3 = wallettransaction instanceof c3 ? ((c3) wallettransaction).a : wallettransaction;
        TL_wallet.walletTransaction wallettransaction4 = wallettransaction2 instanceof c3 ? ((c3) wallettransaction2).a : wallettransaction2;
        return wallettransaction3 == wallettransaction4 || l0.i0(wallettransaction, wallettransaction2) || l0.i0(wallettransaction3, wallettransaction4);
    }

    @Override // org.telegram.ui.Components.t61
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        ((f3) view).g((TL_wallet.walletTransaction) u61Var.G, (e3) u61Var.H, z10);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean contentsEquals(u61 u61Var, u61 u61Var2) {
        Object obj = u61Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = u61Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new f3(context, i10, u6Var);
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean equals(u61 u61Var, u61 u61Var2) {
        Object obj = u61Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = u61Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return a((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.t61
    public final boolean isClickable() {
        return true;
    }
}
