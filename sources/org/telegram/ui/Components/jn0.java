package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jn0 extends f2.q {
    public final /* synthetic */ nn0 b;

    public jn0(nn0 nn0Var) {
        this.b = nn0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        nn0 nn0Var = this.b;
        return ((kn0) nn0Var.n.get(i10)).equals(nn0Var.r.get(i11));
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        nn0 nn0Var = this.b;
        return ((kn0) nn0Var.n.get(i10)).a.h == ((kn0) nn0Var.r.get(i11)).a.h;
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
