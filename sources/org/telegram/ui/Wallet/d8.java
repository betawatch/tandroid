package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;

    public /* synthetic */ d8(e8 e8Var, int i7) {
        this.a = i7;
        this.b = e8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        e8 e8Var = this.b;
        switch (i7) {
            case 0:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e8Var.getParentActivity(), e8Var.getResourceProvider());
                alertDialog$Builder.a.T = id.M0(2131743127, null);
                jg.g.C(null, 2131747832, alertDialog$Builder, null);
                break;
            default:
                e8Var.d0();
                break;
        }
    }
}
