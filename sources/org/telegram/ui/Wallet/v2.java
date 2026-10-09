package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class v2 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new v2());
    }

    public static boolean a(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3 = wallettransaction instanceof u2 ? ((u2) wallettransaction).a : wallettransaction;
        TL_wallet.walletTransaction wallettransaction4 = wallettransaction2 instanceof u2 ? ((u2) wallettransaction2).a : wallettransaction2;
        return wallettransaction3 == wallettransaction4 || k0.d0(wallettransaction, wallettransaction2) || k0.d0(wallettransaction3, wallettransaction4);
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        ((x2) view).h((TL_wallet.walletTransaction) p61Var.G, (w2) p61Var.H, z10);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean contentsEquals(p61 p61Var, p61 p61Var2) {
        Object obj = p61Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = p61Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new x2(context, i10, e6Var);
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean equals(p61 p61Var, p61 p61Var2) {
        Object obj = p61Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = p61Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return a((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.o61
    public final boolean isClickable() {
        return true;
    }
}
