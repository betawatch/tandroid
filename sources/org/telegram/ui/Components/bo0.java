package org.telegram.ui.Components;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class bo0 extends s4.o {
    public final /* synthetic */ fo0 b;

    public bo0(fo0 fo0Var) {
        this.b = fo0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        fo0 fo0Var = this.b;
        return ((co0) fo0Var.n.get(i10)).equals(fo0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        fo0 fo0Var = this.b;
        return ((co0) fo0Var.n.get(i10)).a.h == ((co0) fo0Var.r.get(i11)).a.h;
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
