package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class st0 extends g.o {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ st0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                tu0 tu0Var = (tu0) this.d;
                s4.h0 adapter = tu0Var.n.getAdapter();
                aw0 aw0Var = (aw0) this.e;
                uv0 uv0Var = aw0Var.K;
                if (adapter == uv0Var) {
                    if (uv0Var.j(i10) == 2) {
                        return tu0Var.r.J;
                    }
                    return 1;
                }
                if (aw0.x(aw0Var, adapter) == -1) {
                    return 1;
                }
                ((xv0) adapter).getClass();
                return 1;
            default:
                ei.h hVar = (ei.h) this.d;
                j71 j71Var = ((r71) this.e).g3;
                if (j71Var == null) {
                    return hVar.J;
                }
                t61 G = j71Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? hVar.J : i11;
        }
    }
}
