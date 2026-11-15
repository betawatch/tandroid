package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class ql0 extends v4.o {
    public final /* synthetic */ ul0 b;

    public ql0(ul0 ul0Var) {
        this.b = ul0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        ul0 ul0Var = this.b;
        return ((rl0) ul0Var.n.get(i7)).equals(ul0Var.r.get(i10));
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        ul0 ul0Var = this.b;
        return ((rl0) ul0Var.n.get(i7)).a.h == ((rl0) ul0Var.r.get(i10)).a.h;
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
