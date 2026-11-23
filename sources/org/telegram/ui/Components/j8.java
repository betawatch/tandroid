package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ j8(x8 x8Var, int i7) {
        this.a = i7;
        this.b = x8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x8 x8Var = this.b;
                if (!x8Var.V) {
                    if (x8Var.O <= 0.0f) {
                        x8Var.l0(!x8Var.a.w, true, false);
                        break;
                    } else {
                        if (x8Var.N != null) {
                            x8Var.F = 1.0f;
                            x8Var.G = true;
                        }
                        org.telegram.messenger.g0.v1(x8Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                x8 x8Var2 = this.b;
                x8Var2.getClass();
                x8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
