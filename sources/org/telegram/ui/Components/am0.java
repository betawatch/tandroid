package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class am0 extends v4.o {
    public final /* synthetic */ em0 b;

    public am0(em0 em0Var) {
        this.b = em0Var;
    }

    @Override // v4.o
    public final boolean a(int i7, int i10) {
        em0 em0Var = this.b;
        return ((bm0) em0Var.n.get(i7)).equals(em0Var.r.get(i10));
    }

    @Override // v4.o
    public final boolean b(int i7, int i10) {
        em0 em0Var = this.b;
        return ((bm0) em0Var.n.get(i7)).a.h == ((bm0) em0Var.r.get(i10)).a.h;
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
