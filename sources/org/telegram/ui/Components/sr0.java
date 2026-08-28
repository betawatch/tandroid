package org.telegram.ui.Components;

import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class sr0 extends f2.x {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ sr0(ViewGroup viewGroup, Object obj, int i9) {
        this.c = i9;
        this.e = viewGroup;
        this.d = obj;
    }

    @Override // f2.x
    public final int i(int i9) {
        int i10;
        switch (this.c) {
            case 0:
                xs0 xs0Var = (xs0) this.d;
                f2.r0 adapter = xs0Var.r.getAdapter();
                eu0 eu0Var = (eu0) this.e;
                yt0 yt0Var = eu0Var.E;
                if (adapter == yt0Var) {
                    if (yt0Var.j(i9) == 2) {
                        return xs0Var.s.J;
                    }
                    return 1;
                }
                if (eu0.v(eu0Var, adapter) == -1) {
                    return 1;
                }
                ((bu0) adapter).getClass();
                return 1;
            default:
                jh.h hVar = (jh.h) this.d;
                z41 z41Var = ((i51) this.e).U2;
                if (z41Var == null) {
                    return hVar.J;
                }
                l41 G = z41Var.G(i9);
                return (G == null || (i10 = G.u) == -1) ? hVar.J : i10;
        }
    }
}
