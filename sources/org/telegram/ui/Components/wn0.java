package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class wn0 extends s4.o {
    public final /* synthetic */ ao0 b;

    public wn0(ao0 ao0Var) {
        this.b = ao0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        ao0 ao0Var = this.b;
        return ((xn0) ao0Var.n.get(i10)).equals(ao0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        ao0 ao0Var = this.b;
        return ((xn0) ao0Var.n.get(i10)).a.h == ((xn0) ao0Var.r.get(i11)).a.h;
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
