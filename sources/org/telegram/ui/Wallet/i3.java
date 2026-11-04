package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.fc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;

    public /* synthetic */ i3(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i3;
        this.b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        org.telegram.ui.ActionBar.d2 d2Var = this.b;
        switch (i3) {
            case 0:
                w5.I0(d2Var.getContext(), d2Var.getResourceProvider());
                break;
            case 1:
                d2Var.presentFragment(new w5());
                break;
            default:
                if (fc.a(d2Var)) {
                    fc.a0(d2Var).I(R.raw.contact_check, bd.M0(2131743160, null), bd.M0(2131743159, null)).j();
                    break;
                }
                break;
        }
    }
}
