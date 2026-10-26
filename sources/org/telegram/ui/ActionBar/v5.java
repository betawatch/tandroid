package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v5 implements oe.f, r0 {
    public final /* synthetic */ x5 a;

    public /* synthetic */ v5(x5 x5Var) {
        this.a = x5Var;
    }

    @Override // oe.f
    public void P() {
        x5 x5Var = this.a;
        x5Var.d();
        x5Var.a.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.r0
    public void g(int i10) {
        j jVar = this.a.a.T;
        if (jVar != null) {
            jVar.b(i10);
        }
    }

    @Override // oe.f
    public /* synthetic */ boolean j() {
        return false;
    }

    @Override // oe.f
    public /* synthetic */ boolean k(float f7) {
        return false;
    }

    @Override // oe.f
    public /* synthetic */ void a() {
    }

    @Override // oe.f
    public /* synthetic */ void l() {
    }

    @Override // oe.f
    public /* synthetic */ void i(boolean z10) {
    }
}
