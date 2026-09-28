package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e9 b;

    public /* synthetic */ p8(e9 e9Var, int i10) {
        this.a = i10;
        this.b = e9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e9 e9Var = this.b;
                if (!e9Var.U) {
                    if (e9Var.N <= 0.0f) {
                        e9Var.g0(!e9Var.a.v, true, false);
                        break;
                    } else {
                        if (e9Var.M != null) {
                            e9Var.E = 1.0f;
                            e9Var.F = true;
                        }
                        AndroidUtilities.hideKeyboard(e9Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                e9 e9Var2 = this.b;
                e9Var2.getClass();
                e9Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
