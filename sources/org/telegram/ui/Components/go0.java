package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class go0 extends s4.o {
    public final /* synthetic */ ko0 b;

    public go0(ko0 ko0Var) {
        this.b = ko0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        ko0 ko0Var = this.b;
        return ((ho0) ko0Var.n.get(i10)).equals(ko0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        ko0 ko0Var = this.b;
        return ((ho0) ko0Var.n.get(i10)).a.h == ((ho0) ko0Var.r.get(i11)).a.h;
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
