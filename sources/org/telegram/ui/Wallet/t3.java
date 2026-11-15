package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class t3 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new t3());
    }

    public static boolean i(TL_wallet.walletTransaction wallettransaction, TL_wallet.walletTransaction wallettransaction2) {
        TL_wallet.walletTransaction wallettransaction3 = wallettransaction instanceof s3 ? ((s3) wallettransaction).a : wallettransaction;
        TL_wallet.walletTransaction wallettransaction4 = wallettransaction2 instanceof s3 ? ((s3) wallettransaction2).a : wallettransaction2;
        return wallettransaction3 == wallettransaction4 || l0.i0(wallettransaction, wallettransaction2) || l0.i0(wallettransaction3, wallettransaction4);
    }

    @Override // org.telegram.ui.Components.a41
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        ((v3) view).g((TL_wallet.walletTransaction) b41Var.G, (u3) b41Var.H, z10);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean c(b41 b41Var, b41 b41Var2) {
        Object obj = b41Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = b41Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return ((TL_wallet.walletTransaction) obj).equals((TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new v3(i7, context, e6Var);
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean e(b41 b41Var, b41 b41Var2) {
        Object obj = b41Var.G;
        if (!(obj instanceof TL_wallet.walletTransaction)) {
            return false;
        }
        Object obj2 = b41Var2.G;
        if (obj2 instanceof TL_wallet.walletTransaction) {
            return i((TL_wallet.walletTransaction) obj, (TL_wallet.walletTransaction) obj2);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.a41
    public final boolean f() {
        return true;
    }
}
