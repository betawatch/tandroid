package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class fo0 extends s4.o {
    public final /* synthetic */ jo0 b;

    public fo0(jo0 jo0Var) {
        this.b = jo0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        jo0 jo0Var = this.b;
        return ((go0) jo0Var.n.get(i10)).equals(jo0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        jo0 jo0Var = this.b;
        return ((go0) jo0Var.n.get(i10)).a.h == ((go0) jo0Var.r.get(i11)).a.h;
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
