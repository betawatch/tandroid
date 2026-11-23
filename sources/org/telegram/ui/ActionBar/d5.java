package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements te.d, l0 {
    public final /* synthetic */ f5 a;

    public /* synthetic */ d5(f5 f5Var) {
        this.a = f5Var;
    }

    @Override // te.d
    public /* synthetic */ boolean C() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean D(float f10) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        j jVar = this.a.a.W;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override // te.d
    public void m1() {
        f5 f5Var = this.a;
        f5Var.e();
        f5Var.a.invalidate();
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
