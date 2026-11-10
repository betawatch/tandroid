package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s8 b;

    public /* synthetic */ f8(s8 s8Var, int i7) {
        this.a = i7;
        this.b = s8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s8 s8Var = this.b;
                if (!s8Var.U) {
                    if (s8Var.N <= 0.0f) {
                        s8Var.l0(!s8Var.a.w, true, false);
                        break;
                    } else {
                        if (s8Var.M != null) {
                            s8Var.E = 1.0f;
                            s8Var.F = true;
                        }
                        org.telegram.messenger.g0.v1(s8Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                s8 s8Var2 = this.b;
                s8Var2.getClass();
                s8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
