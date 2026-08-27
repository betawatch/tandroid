package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class qm0 extends f2.q {
    public final /* synthetic */ um0 b;

    public qm0(um0 um0Var) {
        this.b = um0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        um0 um0Var = this.b;
        return ((rm0) um0Var.n.get(i10)).equals(um0Var.r.get(i11));
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        um0 um0Var = this.b;
        return ((rm0) um0Var.n.get(i10)).a.h == ((rm0) um0Var.r.get(i11)).a.h;
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
