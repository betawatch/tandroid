package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements te.d, m0 {
    public final /* synthetic */ e5 a;

    public /* synthetic */ c5(e5 e5Var) {
        this.a = e5Var;
    }

    @Override // te.d
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean B(float f10) {
        return false;
    }

    @Override // te.d
    public void Y0() {
        e5 e5Var = this.a;
        e5Var.e();
        e5Var.a.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        j jVar = this.a.a.V;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override // te.d
    public /* synthetic */ void l(boolean z9) {
    }

    @Override // te.d
    public /* synthetic */ void D() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }
}
