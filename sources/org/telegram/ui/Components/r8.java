package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ r8(f9 f9Var, int i10) {
        this.a = i10;
        this.b = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f9 f9Var = this.b;
                if (!f9Var.U) {
                    if (f9Var.N <= 0.0f) {
                        f9Var.g0(!f9Var.a.v, true, false);
                        break;
                    } else {
                        if (f9Var.M != null) {
                            f9Var.E = 1.0f;
                            f9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(f9Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                f9 f9Var2 = this.b;
                f9Var2.getClass();
                f9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
