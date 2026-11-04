package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r8 b;

    public /* synthetic */ e8(r8 r8Var, int i3) {
        this.a = i3;
        this.b = r8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r8 r8Var = this.b;
                if (!r8Var.V) {
                    if (r8Var.O <= 0.0f) {
                        r8Var.l0(!r8Var.a.w, true, false);
                        break;
                    } else {
                        if (r8Var.N != null) {
                            r8Var.F = 1.0f;
                            r8Var.G = true;
                        }
                        org.telegram.messenger.g0.v1(r8Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                r8 r8Var2 = this.b;
                r8Var2.getClass();
                r8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
