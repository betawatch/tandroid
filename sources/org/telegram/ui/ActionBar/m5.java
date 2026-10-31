package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m5 implements fe.g, o0 {
    public final /* synthetic */ o5 a;

    public /* synthetic */ m5(o5 o5Var) {
        this.a = o5Var;
    }

    @Override // org.telegram.ui.ActionBar.o0
    public void k(int i10) {
        k kVar = this.a.a.V;
        if (kVar != null) {
            kVar.b(i10);
        }
    }

    @Override // fe.g
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // fe.g
    public /* synthetic */ boolean m(float f7) {
        return false;
    }

    @Override // fe.g
    public void z() {
        o5 o5Var = this.a;
        o5Var.e();
        o5Var.a.invalidate();
    }

    @Override // fe.g
    public /* synthetic */ void g(boolean z10) {
    }

    @Override // fe.g
    public /* synthetic */ void a() {
    }

    @Override // fe.g
    public /* synthetic */ void n() {
    }
}
