package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jo0 extends s4.o {
    public final /* synthetic */ no0 b;

    public jo0(no0 no0Var) {
        this.b = no0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        no0 no0Var = this.b;
        return ((ko0) no0Var.n.get(i10)).equals(no0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        no0 no0Var = this.b;
        return ((ko0) no0Var.n.get(i10)).a.h == ((ko0) no0Var.r.get(i11)).a.h;
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
