package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.kc;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ u3(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = this.b;
        switch (i7) {
            case 0:
                g2Var.presentFragment(new o6());
                break;
            case 1:
                o6.M0(g2Var.getContext(), g2Var.getResourceProvider());
                break;
            default:
                if (kc.a(g2Var)) {
                    kc.b0(g2Var).I(R.raw.contact_check, gd.N0(2131742899, null), gd.N0(2131742898, null)).j();
                    break;
                }
                break;
        }
    }
}
