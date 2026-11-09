package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class nl0 extends v4.o {
    public final /* synthetic */ rl0 b;

    public nl0(rl0 rl0Var) {
        this.b = rl0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        rl0 rl0Var = this.b;
        return ((ol0) rl0Var.n.get(i7)).equals(rl0Var.r.get(i10));
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        rl0 rl0Var = this.b;
        return ((ol0) rl0Var.n.get(i7)).a.h == ((ol0) rl0Var.r.get(i10)).a.h;
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
