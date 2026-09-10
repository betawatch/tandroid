package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class nn0 extends s4.o {
    public final /* synthetic */ rn0 b;

    public nn0(rn0 rn0Var) {
        this.b = rn0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        rn0 rn0Var = this.b;
        return ((on0) rn0Var.n.get(i10)).equals(rn0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        rn0 rn0Var = this.b;
        return ((on0) rn0Var.n.get(i10)).a.h == ((on0) rn0Var.r.get(i11)).a.h;
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
