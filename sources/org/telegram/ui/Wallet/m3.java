package org.telegram.ui.Wallet;

import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.Components.gc;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ m3(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        org.telegram.ui.ActionBar.f2 f2Var = this.b;
        switch (i7) {
            case 0:
                f2Var.presentFragment(new z5());
                break;
            case 1:
                z5.I0(f2Var.getContext(), f2Var.getResourceProvider());
                break;
            default:
                if (gc.a(f2Var)) {
                    gc.a0(f2Var).I(R.raw.contact_check, id.M0(2131743150, null), id.M0(2131743149, null)).j();
                    break;
                }
                break;
        }
    }
}
