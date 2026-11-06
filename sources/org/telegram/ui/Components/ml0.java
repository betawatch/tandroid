package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ml0 extends v4.o {
    public final /* synthetic */ ql0 b;

    public ml0(ql0 ql0Var) {
        this.b = ql0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        ql0 ql0Var = this.b;
        return ((nl0) ql0Var.n.get(i7)).equals(ql0Var.r.get(i10));
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        ql0 ql0Var = this.b;
        return ((nl0) ql0Var.n.get(i7)).a.h == ((nl0) ql0Var.r.get(i10)).a.h;
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
