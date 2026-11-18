package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class yl0 extends v4.o {
    public final /* synthetic */ cm0 b;

    public yl0(cm0 cm0Var) {
        this.b = cm0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        cm0 cm0Var = this.b;
        return ((zl0) cm0Var.n.get(i7)).equals(cm0Var.r.get(i10));
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        cm0 cm0Var = this.b;
        return ((zl0) cm0Var.n.get(i7)).a.h == ((zl0) cm0Var.r.get(i10)).a.h;
    }

    @Override // v4.o
    public final int d() {
        return this.b.r.size();
    }

    @Override // v4.o
    public final int e() {
        return this.b.n.size();
    }
}
