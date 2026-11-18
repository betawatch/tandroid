package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e5 implements te.d, m0 {
    public final /* synthetic */ g5 a;

    public /* synthetic */ e5(g5 g5Var) {
        this.a = g5Var;
    }

    @Override // te.d
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean D(float f10) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void g(int i7) {
        j jVar = this.a.a.W;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override // te.d
    public void m1() {
        g5 g5Var = this.a;
        g5Var.e();
        g5Var.a.invalidate();
    }

    @Override // te.d
    public /* synthetic */ void x(boolean z10) {
    }

    @Override // te.d
    public /* synthetic */ void H() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }
}
