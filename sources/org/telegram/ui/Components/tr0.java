package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class tr0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ tr0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        int i12;
        switch (this.c) {
            case 0:
                ts0 ts0Var = (ts0) this.d;
                s4.g0 adapter = ts0Var.n.getAdapter();
                au0 au0Var = (au0) this.e;
                ut0 ut0Var = au0Var.K;
                if (adapter == ut0Var) {
                    if (ut0Var.d(i10) == 2) {
                        return ts0Var.r.J;
                    }
                    return 1;
                }
                if (au0.w(au0Var, adapter) == -1) {
                    return 1;
                }
                ((xt0) adapter).getClass();
                return 1;
            case 1:
                t51 t51Var = (t51) this.d;
                q51 q51Var = ((v51) this.e).f3;
                if (q51Var == null) {
                    return t51Var.J;
                }
                b51 G = q51Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? t51Var.J : i11;
            default:
                t51 t51Var2 = (t51) this.d;
                q51 q51Var2 = ((v51) this.e).f3;
                if (q51Var2 == null) {
                    return t51Var2.J;
                }
                b51 G2 = q51Var2.G(i10);
                return (G2 == null || (i12 = G2.u) == -1) ? t51Var2.J : i12;
        }
    }
}
