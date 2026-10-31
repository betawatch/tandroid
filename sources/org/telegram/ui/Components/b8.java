package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ b8(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                o8 o8Var = this.b;
                if (!o8Var.U) {
                    if (o8Var.N <= 0.0f) {
                        o8Var.k0(!o8Var.a.w, true, false);
                        break;
                    } else {
                        if (o8Var.M != null) {
                            o8Var.E = 1.0f;
                            o8Var.F = true;
                        }
                        org.telegram.messenger.i0.v1(o8Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                o8 o8Var2 = this.b;
                o8Var2.getClass();
                o8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
