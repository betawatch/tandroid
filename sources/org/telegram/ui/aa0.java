package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sa0 b;

    public /* synthetic */ aa0(sa0 sa0Var, int i7) {
        this.a = i7;
        this.b = sa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sa0.c0(this.b);
                break;
            case 1:
                sa0 sa0Var = this.b;
                org.telegram.messenger.ua uaVar = sa0Var.F;
                if (uaVar != null) {
                    sa0Var.E.h(uaVar);
                    sa0Var.F = null;
                    break;
                }
                break;
            case 2:
                sa0.a0(this.b);
                break;
            case 3:
                sa0 sa0Var2 = this.b;
                sa0Var2.getLocationController().o(0, sa0Var2.l0, true);
                sa0Var2.y = false;
                break;
            case 4:
                sa0 sa0Var3 = this.b;
                org.telegram.messenger.fa faVar = sa0Var3.E;
                if (faVar != null) {
                    faVar.o(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), sa0Var3.t0());
                }
                if (!sa0Var3.N.getRadiusSet()) {
                    double d = sa0Var3.L;
                    if (d > 0.0d) {
                        sa0Var3.K.V0(d);
                    } else {
                        m4.d0 d0Var = sa0Var3.K;
                        if (d0Var != null) {
                            d0Var.R0();
                            sa0Var3.K = null;
                        }
                    }
                }
                sa0Var3.N = null;
                break;
            case 5:
                this.b.D0();
                break;
            case 6:
                this.b.D0();
                break;
            default:
                org.telegram.messenger.g0.h3(new aa0(this.b, 1));
                break;
        }
    }
}
