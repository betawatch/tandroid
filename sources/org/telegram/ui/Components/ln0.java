package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ln0 extends f2.q {
    public final /* synthetic */ pn0 b;

    public ln0(pn0 pn0Var) {
        this.b = pn0Var;
    }

    @Override // f2.q
    public final boolean a(int i10, int i11) {
        pn0 pn0Var = this.b;
        return ((mn0) pn0Var.n.get(i10)).equals(pn0Var.r.get(i11));
    }

    @Override // f2.q
    public final boolean b(int i10, int i11) {
        pn0 pn0Var = this.b;
        return ((mn0) pn0Var.n.get(i10)).a.h == ((mn0) pn0Var.r.get(i11)).a.h;
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
