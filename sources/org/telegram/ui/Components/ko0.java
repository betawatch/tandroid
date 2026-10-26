package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ko0 extends s4.p {
    public final /* synthetic */ oo0 b;

    public ko0(oo0 oo0Var) {
        this.b = oo0Var;
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        oo0 oo0Var = this.b;
        return ((lo0) oo0Var.n.get(i10)).equals(oo0Var.r.get(i11));
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        oo0 oo0Var = this.b;
        return ((lo0) oo0Var.n.get(i10)).a.h == ((lo0) oo0Var.r.get(i11)).a.h;
    }

    @Override // s4.p
    public final int d() {
        return this.b.r.size();
    }

    @Override // s4.p
    public final int e() {
        return this.b.n.size();
    }
}
