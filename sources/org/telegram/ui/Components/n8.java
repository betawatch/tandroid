package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c9 b;

    public /* synthetic */ n8(c9 c9Var, int i10) {
        this.a = i10;
        this.b = c9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c9 c9Var = this.b;
                if (!c9Var.U) {
                    if (c9Var.N <= 0.0f) {
                        c9Var.g0(!c9Var.a.v, true, false);
                        break;
                    } else {
                        if (c9Var.M != null) {
                            c9Var.E = 1.0f;
                            c9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(c9Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                c9 c9Var2 = this.b;
                c9Var2.getClass();
                c9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
