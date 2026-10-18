package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class bo0 extends s4.o {
    public final /* synthetic */ fo0 b;

    public bo0(fo0 fo0Var) {
        this.b = fo0Var;
    }

    @Override // s4.o
    public final boolean a(int i10, int i11) {
        fo0 fo0Var = this.b;
        return ((co0) fo0Var.n.get(i10)).equals(fo0Var.r.get(i11));
    }

    @Override // s4.o
    public final boolean b(int i10, int i11) {
        fo0 fo0Var = this.b;
        return ((co0) fo0Var.n.get(i10)).a.h == ((co0) fo0Var.r.get(i11)).a.h;
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
