package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j11 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z11 b;

    public /* synthetic */ j11(z11 z11Var, int i7) {
        this.a = i7;
        this.b = z11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z11 z11Var = this.b;
                if (z11Var.l()) {
                    z11Var.m();
                    break;
                }
                break;
            default:
                z11 z11Var2 = this.b;
                o11 o11Var = z11Var2.K;
                o11Var.z1(true);
                m11 m11Var = z11Var2.y;
                m11Var.z1(true);
                z11Var2.N.a(true, true);
                org.telegram.messenger.g0.Z3(m11Var);
                org.telegram.messenger.g0.Z3(o11Var);
                break;
        }
    }
}
