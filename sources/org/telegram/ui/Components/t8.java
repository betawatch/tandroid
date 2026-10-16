package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ t8(h9 h9Var, int i10) {
        this.a = i10;
        this.b = h9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h9 h9Var = this.b;
                if (!h9Var.U) {
                    if (h9Var.N <= 0.0f) {
                        h9Var.g0(!h9Var.a.v, true, false);
                        break;
                    } else {
                        if (h9Var.M != null) {
                            h9Var.E = 1.0f;
                            h9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(h9Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                h9 h9Var2 = this.b;
                h9Var2.getClass();
                h9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
