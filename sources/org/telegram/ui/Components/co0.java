package org.telegram.ui.Components;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class co0 extends s4.o {
    public final /* synthetic */ go0 b;

    public co0(go0 go0Var) {
        this.b = go0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        go0 go0Var = this.b;
        return ((do0) go0Var.n.get(i10)).equals(go0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        go0 go0Var = this.b;
        return ((do0) go0Var.n.get(i10)).a.h == ((do0) go0Var.r.get(i11)).a.h;
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
