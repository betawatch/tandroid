package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ls0 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ls0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                qt0 qt0Var = (qt0) this.d;
                f2.o0 adapter = qt0Var.r.getAdapter();
                yu0 yu0Var = (yu0) this.e;
                su0 su0Var = yu0Var.F;
                if (adapter == su0Var) {
                    if (su0Var.j(i10) == 2) {
                        return qt0Var.s.J;
                    }
                    return 1;
                }
                if (yu0.v(yu0Var, adapter) == -1) {
                    return 1;
                }
                ((vu0) adapter).getClass();
                return 1;
            default:
                oh.h hVar = (oh.h) this.d;
                w51 w51Var = ((g61) this.e).V2;
                if (w51Var == null) {
                    return hVar.J;
                }
                i51 G = w51Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? hVar.J : i11;
        }
    }
}
