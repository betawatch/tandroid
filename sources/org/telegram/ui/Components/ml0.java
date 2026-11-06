package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
