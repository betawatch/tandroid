package org.telegram.ui.Components;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class co0 extends s4.o {
    public final /* synthetic */ go0 b;

    public co0(go0 go0Var) {
        this.b = go0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        go0 go0Var = this.b;
        return ((do0) go0Var.n.get(i10)).equals(go0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        go0 go0Var = this.b;
        return ((do0) go0Var.n.get(i10)).a.h == ((do0) go0Var.r.get(i11)).a.h;
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
