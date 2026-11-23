package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class am0 extends v4.p {
    public final /* synthetic */ em0 b;

    public am0(em0 em0Var) {
        this.b = em0Var;
    }

    @Override // v4.p
    public final boolean a(int i7, int i10) {
        em0 em0Var = this.b;
        return ((bm0) em0Var.n.get(i7)).equals(em0Var.r.get(i10));
    }

    @Override // v4.p
    public final boolean b(int i7, int i10) {
        em0 em0Var = this.b;
        return ((bm0) em0Var.n.get(i7)).a.h == ((bm0) em0Var.r.get(i10)).a.h;
    }

    @Override // v4.p
    public final int d() {
        return this.b.r.size();
    }

    @Override // v4.p
    public final int e() {
        return this.b.n.size();
    }
}
