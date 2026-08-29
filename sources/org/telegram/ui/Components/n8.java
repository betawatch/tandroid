package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b9 b;

    public /* synthetic */ n8(b9 b9Var, int i10) {
        this.a = i10;
        this.b = b9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b9 b9Var = this.b;
                if (!b9Var.Q) {
                    if (b9Var.J <= 0.0f) {
                        b9Var.g0(!b9Var.a.v, true, false);
                        break;
                    } else {
                        if (b9Var.I != null) {
                            b9Var.A = 1.0f;
                            b9Var.B = true;
                        }
                        AndroidUtilities.hideKeyboard(b9Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                b9 b9Var2 = this.b;
                b9Var2.getClass();
                b9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
