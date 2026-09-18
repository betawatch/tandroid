package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ns0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ns0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                st0 st0Var = (st0) this.d;
                s4.h0 adapter = st0Var.r.getAdapter();
                zu0 zu0Var = (zu0) this.e;
                tu0 tu0Var = zu0Var.I;
                if (adapter == tu0Var) {
                    if (tu0Var.j(i10) == 2) {
                        return st0Var.s.J;
                    }
                    return 1;
                }
                if (zu0.v(zu0Var, adapter) == -1) {
                    return 1;
                }
                ((wu0) adapter).getClass();
                return 1;
            default:
                bi.i iVar = (bi.i) this.d;
                x51 x51Var = ((f61) this.e).Y2;
                if (x51Var == null) {
                    return iVar.J;
                }
                j51 G = x51Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? iVar.J : i11;
        }
    }
}
