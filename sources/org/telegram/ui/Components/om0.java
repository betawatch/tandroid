package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class om0 extends s4.n {
    public final /* synthetic */ sm0 b;

    public om0(sm0 sm0Var) {
        this.b = sm0Var;
    }

    @Override // s4.n
    public final boolean a(int i10, int i11) {
        sm0 sm0Var = this.b;
        return ((pm0) sm0Var.n.get(i10)).equals(sm0Var.r.get(i11));
    }

    @Override // s4.n
    public final boolean b(int i10, int i11) {
        sm0 sm0Var = this.b;
        return ((pm0) sm0Var.n.get(i10)).a.h == ((pm0) sm0Var.r.get(i11)).a.h;
    }

    @Override // s4.n
    public final int d() {
        return this.b.r.size();
    }

    @Override // s4.n
    public final int e() {
        return this.b.n.size();
    }
}
