package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class v2 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new v2());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3 = wallettransaction instanceof u2 ? ((u2) wallettransaction).a : wallettransaction;
        TL_wallet.walletTransaction wallettransaction4 = wallettransaction2 instanceof u2 ? ((u2) wallettransaction2).a : wallettransaction2;
        return wallettransaction3 == wallettransaction4 || j0.d0(wallettransaction, wallettransaction2) || j0.d0(wallettransaction3, wallettransaction4);
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((x2) view).h((TL_wallet.walletTransaction) l61Var.G, (w2) l61Var.H, z10);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean contentsEquals(l61 l61Var, l61 l61Var2) {
        Object obj = l61Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = l61Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new x2(context, i10, c6Var);
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean equals(l61 l61Var, l61 l61Var2) {
        Object obj = l61Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = l61Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return a((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.k61
    public final boolean isClickable() {
        return true;
    }
}
