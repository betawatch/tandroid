package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 b;

    public /* synthetic */ t3(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.a = i7;
        this.b = h2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.h2 h2Var = this.b;
        switch (i7) {
            case 0:
                h2Var.presentFragment(new n6());
                break;
            case 1:
                n6.M0(h2Var.getContext(), h2Var.getResourceProvider());
                break;
            default:
                if (lc.a(h2Var)) {
                    lc.b0(h2Var).I(R.raw.contact_check, gd.M0(2131742912, null), gd.M0(2131742911, null)).j();
                    break;
                }
                break;
        }
    }
}
