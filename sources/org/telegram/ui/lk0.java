package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl0 b;

    public /* synthetic */ lk0(kl0 kl0Var, int i7) {
        this.a = i7;
        this.b = kl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z0();
                break;
            case 1:
                kl0 kl0Var = this.b;
                kl0Var.getMessagesController().l7 = null;
                if (kl0Var.f1 == 3 && !kl0Var.isFinishing()) {
                    kl0Var.f1 = 4;
                    jl0 jl0Var = kl0Var.Z0;
                    if (jl0Var != null) {
                        jl0Var.b(4);
                    }
                    kl0Var.finishFragment();
                    break;
                } else if (kl0Var.f1 == 1 && !kl0Var.isFinishing()) {
                    kl0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                kl0 kl0Var2 = this.b;
                if (kl0Var2.d0 != null) {
                    kl0Var2.C0();
                    kl0Var2.d0 = null;
                    break;
                }
                break;
            default:
                kl0 kl0Var3 = this.b;
                kl0Var3.f[0].requestFocus();
                org.telegram.messenger.g0.K3(kl0Var3.f[0]);
                break;
        }
    }
}
