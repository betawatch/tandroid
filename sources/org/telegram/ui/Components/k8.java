package org.telegram.ui.Components;

import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ k8(y8 y8Var, int i7) {
        this.a = i7;
        this.b = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y8 y8Var = this.b;
                if (!y8Var.V) {
                    if (y8Var.O <= 0.0f) {
                        y8Var.l0(!y8Var.a.w, true, false);
                        break;
                    } else {
                        if (y8Var.N != null) {
                            y8Var.F = 1.0f;
                            y8Var.G = true;
                        }
                        org.telegram.messenger.g0.v1(y8Var.fragmentView);
                        break;
                    }
                }
                break;
            default:
                y8 y8Var2 = this.b;
                y8Var2.getClass();
                y8Var2.presentFragment(new PremiumPreviewFragment(0, "avatar"));
                break;
        }
    }
}
