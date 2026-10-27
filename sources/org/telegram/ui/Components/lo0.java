package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lo0 extends s4.p {
    public final /* synthetic */ po0 b;

    public lo0(po0 po0Var) {
        this.b = po0Var;
    }

    @Override // s4.p
    public final boolean a(int i10, int i11) {
        po0 po0Var = this.b;
        return ((mo0) po0Var.n.get(i10)).equals(po0Var.r.get(i11));
    }

    @Override // s4.p
    public final boolean b(int i10, int i11) {
        po0 po0Var = this.b;
        return ((mo0) po0Var.n.get(i10)).a.h == ((mo0) po0Var.r.get(i11)).a.h;
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
