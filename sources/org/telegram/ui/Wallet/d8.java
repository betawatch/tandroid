package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ d8(e8 e8Var, int i3) {
        this.a = i3;
        this.b = e8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        e8 e8Var = this.b;
        switch (i3) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
                alertDialog$Builder.a.U = bd.M0(2131743134, null);
                k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                break;
            default:
                e8Var.d0();
                break;
        }
    }
}
