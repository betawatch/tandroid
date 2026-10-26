package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
