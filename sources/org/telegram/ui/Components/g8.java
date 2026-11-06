package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t8 b;

    public /* synthetic */ g8(t8 t8Var, int i7) {
        this.a = i7;
        this.b = t8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t8 t8Var = this.b;
                if (!t8Var.U) {
                    if (t8Var.N <= 0.0f) {
                        t8Var.l0(!t8Var.a.w, true, false);
                        break;
                    } else {
                        if (t8Var.M != null) {
                            t8Var.E = 1.0f;
                            t8Var.F = true;
                        }
                        org.telegram.messenger.g0.v1(t8Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                t8 t8Var2 = this.b;
                t8Var2.getClass();
                t8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
