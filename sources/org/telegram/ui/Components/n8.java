package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
