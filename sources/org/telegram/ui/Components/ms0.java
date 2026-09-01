package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ms0 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ms0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                rt0 rt0Var = (rt0) this.d;
                f2.p0 adapter = rt0Var.r.getAdapter();
                zu0 zu0Var = (zu0) this.e;
                tu0 tu0Var = zu0Var.F;
                if (adapter == tu0Var) {
                    if (tu0Var.j(i10) == 2) {
                        return rt0Var.s.J;
                    }
                    return 1;
                }
                if (zu0.v(zu0Var, adapter) == -1) {
                    return 1;
                }
                ((wu0) adapter).getClass();
                return 1;
            default:
                h61 h61Var = (h61) this.d;
                x51 x51Var = ((i61) this.e).V2;
                if (x51Var == null) {
                    return h61Var.J;
                }
                j51 G = x51Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? h61Var.J : i11;
        }
    }
}
