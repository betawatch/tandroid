package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of0 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zf0 b;

    public /* synthetic */ of0(zf0 zf0Var, int i10) {
        this.a = i10;
        this.b = zf0Var;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.a) {
            case 0:
                zf0 zf0Var = this.b;
                zf0Var.c(true);
                zf0Var.s0.u1(0, true, null, true);
                break;
            default:
                this.b.s0.u1(0, true, null, true);
                break;
        }
    }
}
