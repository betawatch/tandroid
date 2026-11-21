package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
