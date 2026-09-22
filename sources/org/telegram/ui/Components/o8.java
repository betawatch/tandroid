package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d9 b;

    public /* synthetic */ o8(d9 d9Var, int i10) {
        this.a = i10;
        this.b = d9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d9 d9Var = this.b;
                if (!d9Var.U) {
                    if (d9Var.N <= 0.0f) {
                        d9Var.g0(!d9Var.a.v, true, false);
                        break;
                    } else {
                        if (d9Var.M != null) {
                            d9Var.E = 1.0f;
                            d9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(d9Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                d9 d9Var2 = this.b;
                d9Var2.getClass();
                d9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
