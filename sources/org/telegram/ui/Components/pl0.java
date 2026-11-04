package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pl0 extends u4.o {
    public final /* synthetic */ tl0 b;

    public pl0(tl0 tl0Var) {
        this.b = tl0Var;
    }

    @Override // u4.o
    public final boolean a(int i3, int i10) {
        tl0 tl0Var = this.b;
        return ((ql0) tl0Var.n.get(i3)).equals(tl0Var.r.get(i10));
    }

    @Override // u4.o
    public final boolean b(int i3, int i10) {
        tl0 tl0Var = this.b;
        return ((ql0) tl0Var.n.get(i3)).a.h == ((ql0) tl0Var.r.get(i10)).a.h;
    }

    @Override // u4.o
    public final int d() {
        return this.b.r.size();
    }

    @Override // u4.o
    public final int e() {
        return this.b.n.size();
    }
}
