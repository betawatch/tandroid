package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class qn0 extends s4.o {
    public final /* synthetic */ un0 b;

    public qn0(un0 un0Var) {
        this.b = un0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        un0 un0Var = this.b;
        return ((rn0) un0Var.n.get(i10)).equals(un0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        un0 un0Var = this.b;
        return ((rn0) un0Var.n.get(i10)).a.h == ((rn0) un0Var.r.get(i11)).a.h;
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
