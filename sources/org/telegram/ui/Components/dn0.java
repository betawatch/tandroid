package org.telegram.ui.Components;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class dn0 extends s4.o {
    public final /* synthetic */ hn0 b;

    public dn0(hn0 hn0Var) {
        this.b = hn0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        hn0 hn0Var = this.b;
        return ((en0) hn0Var.n.get(i10)).equals(hn0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        hn0 hn0Var = this.b;
        return ((en0) hn0Var.n.get(i10)).a.h == ((en0) hn0Var.r.get(i11)).a.h;
    }

    @Override // s4.o
    public final int d() {
        return this.b.r.size();
    }

    @Override // s4.o
    public final int e() {
        return this.b.n.size();
    }
}
