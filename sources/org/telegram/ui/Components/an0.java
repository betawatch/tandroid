package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class an0 extends f2.q {
    public final /* synthetic */ en0 b;

    public an0(en0 en0Var) {
        this.b = en0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        en0 en0Var = this.b;
        return ((bn0) en0Var.n.get(i10)).equals(en0Var.r.get(i11));
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        en0 en0Var = this.b;
        return ((bn0) en0Var.n.get(i10)).a.h == ((bn0) en0Var.r.get(i11)).a.h;
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
