package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class dr0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ dr0(ViewGroup viewGroup, Object obj, int i7) {
        this.c = i7;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i7) {
        int i10;
        int i11;
        switch (this.c) {
            case 0:
                ds0 ds0Var = (ds0) this.d;
                v4.i0 adapter = ds0Var.n.getAdapter();
                jt0 jt0Var = (jt0) this.e;
                dt0 dt0Var = jt0Var.L;
                if (adapter == dt0Var) {
                    if (dt0Var.d(i7) == 2) {
                        return ds0Var.r.J;
                    }
                    return 1;
                }
                if (jt0.y(jt0Var, adapter) == -1) {
                    return 1;
                }
                ((gt0) adapter).getClass();
                return 1;
            case 1:
                f51 f51Var = (f51) this.d;
                c51 c51Var = ((h51) this.e).g3;
                if (c51Var == null) {
                    return f51Var.J;
                }
                o41 G = c51Var.G(i7);
                return (G == null || (i10 = G.v) == -1) ? f51Var.J : i10;
            default:
                f51 f51Var2 = (f51) this.d;
                c51 c51Var2 = ((h51) this.e).g3;
                if (c51Var2 == null) {
                    return f51Var2.J;
                }
                o41 G2 = c51Var2.G(i7);
                return (G2 == null || (i11 = G2.v) == -1) ? f51Var2.J : i11;
        }
    }
}
