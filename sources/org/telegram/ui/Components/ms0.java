package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ms0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ms0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                rt0 rt0Var = (rt0) this.d;
                s4.h0 adapter = rt0Var.r.getAdapter();
                yu0 yu0Var = (yu0) this.e;
                su0 su0Var = yu0Var.I;
                if (adapter == su0Var) {
                    if (su0Var.j(i10) == 2) {
                        return rt0Var.s.J;
                    }
                    return 1;
                }
                if (yu0.v(yu0Var, adapter) == -1) {
                    return 1;
                }
                ((vu0) adapter).getClass();
                return 1;
            default:
                bi.i iVar = (bi.i) this.d;
                v51 v51Var = ((d61) this.e).Y2;
                if (v51Var == null) {
                    return iVar.J;
                }
                h51 G = v51Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? iVar.J : i11;
        }
    }
}
