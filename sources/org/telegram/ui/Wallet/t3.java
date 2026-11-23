package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.lc;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;

    public /* synthetic */ t3(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.a = i7;
        this.b = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.g2 g2Var = this.b;
        switch (i7) {
            case 0:
                g2Var.presentFragment(new n6());
                break;
            case 1:
                n6.M0(g2Var.getContext(), g2Var.getResourceProvider());
                break;
            default:
                if (lc.a(g2Var)) {
                    lc.b0(g2Var).I(R.raw.contact_check, hd.N0(2131742904, null), hd.N0(2131742903, null)).j();
                    break;
                }
                break;
        }
    }
}
