package org.telegram.ui;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg0 b;

    public /* synthetic */ jd0(qg0 qg0Var, int i10) {
        this.a = i10;
        this.b = qg0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                qg0 qg0Var = this.b;
                qg0Var.b[qg0Var.a].d();
                qg0Var.k1(true, true);
                break;
            default:
                qg0 qg0Var2 = this.b;
                qg0Var2.l0 = true;
                if (qg0Var2.a != 0) {
                    qg0Var2.u1(0, true, null, true);
                    break;
                }
                break;
        }
    }
}
