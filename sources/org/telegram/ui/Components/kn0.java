package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class kn0 extends f2.q {
    public final /* synthetic */ on0 b;

    public kn0(on0 on0Var) {
        this.b = on0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        on0 on0Var = this.b;
        return ((ln0) on0Var.n.get(i10)).equals(on0Var.r.get(i11));
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        on0 on0Var = this.b;
        return ((ln0) on0Var.n.get(i10)).a.h == ((ln0) on0Var.r.get(i11)).a.h;
    }

    @Override // f2.q
    public final int d() {
        return this.b.r.size();
    }

    @Override // f2.q
    public final int e() {
        return this.b.n.size();
    }
}
