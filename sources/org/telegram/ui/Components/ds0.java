package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ds0 extends f2.v {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ ds0(ViewGroup viewGroup, Object obj, int i10) {
        this.c = i10;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        switch (this.c) {
            case 0:
                it0 it0Var = (it0) this.d;
                f2.p0 adapter = it0Var.r.getAdapter();
                qu0 qu0Var = (qu0) this.e;
                ku0 ku0Var = qu0Var.E;
                if (adapter == ku0Var) {
                    if (ku0Var.j(i10) == 2) {
                        return it0Var.s.J;
                    }
                    return 1;
                }
                if (qu0.v(qu0Var, adapter) == -1) {
                    return 1;
                }
                ((nu0) adapter).getClass();
                return 1;
            default:
                mh.h hVar = (mh.h) this.d;
                k51 k51Var = ((u51) this.e).U2;
                if (k51Var == null) {
                    return hVar.J;
                }
                w41 G = k51Var.G(i10);
                return (G == null || (i11 = G.u) == -1) ? hVar.J : i11;
        }
    }
}
