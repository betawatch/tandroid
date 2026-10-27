package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9 b;

    public /* synthetic */ s8(g9 g9Var, int i10) {
        this.a = i10;
        this.b = g9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g9 g9Var = this.b;
                if (!g9Var.U) {
                    if (g9Var.N <= 0.0f) {
                        g9Var.h0(!g9Var.a.v, true, false);
                        break;
                    } else {
                        if (g9Var.M != null) {
                            g9Var.E = 1.0f;
                            g9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(g9Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                g9 g9Var2 = this.b;
                g9Var2.getClass();
                g9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
