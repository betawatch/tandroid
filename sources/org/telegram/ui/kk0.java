package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;

    public /* synthetic */ kk0(jl0 jl0Var, int i7) {
        this.a = i7;
        this.b = jl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z0();
                break;
            case 1:
                jl0 jl0Var = this.b;
                jl0Var.getMessagesController().m7 = null;
                if (jl0Var.g1 == 3 && !jl0Var.isFinishing()) {
                    jl0Var.g1 = 4;
                    il0 il0Var = jl0Var.a1;
                    if (il0Var != null) {
                        il0Var.e(4);
                    }
                    jl0Var.finishFragment();
                    break;
                } else if (jl0Var.g1 == 1 && !jl0Var.isFinishing()) {
                    jl0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                jl0 jl0Var2 = this.b;
                if (jl0Var2.e0 != null) {
                    jl0Var2.C0();
                    jl0Var2.e0 = null;
                    break;
                }
                break;
            default:
                jl0 jl0Var3 = this.b;
                jl0Var3.f[0].requestFocus();
                org.telegram.messenger.g0.J3(jl0Var3.f[0]);
                break;
        }
    }
}
