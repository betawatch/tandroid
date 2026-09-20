package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class xs0 extends g.p {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ xs0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                cu0 cu0Var = (cu0) this.d;
                s4.h0 adapter = cu0Var.r.getAdapter();
                jv0 jv0Var = (jv0) this.e;
                dv0 dv0Var = jv0Var.I;
                if (adapter == dv0Var) {
                    if (dv0Var.j(i10) == 2) {
                        return cu0Var.s.J;
                    }
                    return 1;
                }
                if (jv0.v(jv0Var, adapter) == -1) {
                    return 1;
                }
                ((gv0) adapter).getClass();
                return 1;
            default:
                bi.i iVar = (bi.i) this.d;
                k61 k61Var = ((s61) this.e).Y2;
                if (k61Var == null) {
                    return iVar.J;
                }
                w51 G = k61Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? iVar.J : i11;
        }
    }
}
