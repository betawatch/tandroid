package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                kl0Var.getMessagesController().o7 = null;
                if (kl0Var.g1 == 3 && !kl0Var.isFinishing()) {
                    kl0Var.g1 = 4;
                    jl0 jl0Var = kl0Var.a1;
                    if (jl0Var != null) {
                        jl0Var.e(4);
                    }
                    kl0Var.finishFragment();
                    break;
                } else if (kl0Var.g1 == 1 && !kl0Var.isFinishing()) {
                    kl0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                kl0 kl0Var2 = this.b;
                if (kl0Var2.e0 != null) {
                    kl0Var2.C0();
                    kl0Var2.e0 = null;
                    break;
                }
                break;
            default:
                kl0 kl0Var3 = this.b;
                kl0Var3.f[0].requestFocus();
                org.telegram.messenger.g0.I3(kl0Var3.f[0]);
                break;
        }
    }
}
