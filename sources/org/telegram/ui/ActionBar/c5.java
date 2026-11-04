package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements qe.d, l0 {
    public final /* synthetic */ e5 a;

    public /* synthetic */ c5(e5 e5Var) {
        this.a = e5Var;
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void i(int i3) {
        j jVar = this.a.a.W;
        if (jVar != null) {
            jVar.b(i3);
        }
    }

    @Override // qe.d
    public void s1() {
        e5 e5Var = this.a;
        e5Var.e();
        e5Var.a.invalidate();
    }

    @Override // qe.d
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // qe.d
    public /* synthetic */ boolean x(float f10) {
        return false;
    }

    @Override // qe.d
    public /* synthetic */ void o(boolean z10) {
    }

    @Override // qe.d
    public /* synthetic */ void G() {
    }

    @Override // qe.d
    public /* synthetic */ void a() {
    }
}
