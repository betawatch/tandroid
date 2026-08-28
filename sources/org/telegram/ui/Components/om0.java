package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class om0 extends f2.s {
    public final /* synthetic */ sm0 b;

    public om0(sm0 sm0Var) {
        this.b = sm0Var;
    }

    @Override // f2.s
    public final boolean a(int i9, int i10) {
        sm0 sm0Var = this.b;
        return ((pm0) sm0Var.n.get(i9)).equals(sm0Var.r.get(i10));
    }

    @Override // f2.s
    public final boolean b(int i9, int i10) {
        sm0 sm0Var = this.b;
        return ((pm0) sm0Var.n.get(i9)).a.h == ((pm0) sm0Var.r.get(i10)).a.h;
    }

    @Override // f2.s
    public final int d() {
        return this.b.r.size();
    }

    @Override // f2.s
    public final int e() {
        return this.b.n.size();
    }
}
