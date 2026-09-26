package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class if0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf0 b;

    public /* synthetic */ if0(tf0 tf0Var, int i10) {
        this.a = i10;
        this.b = tf0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                tf0 tf0Var = this.b;
                tf0Var.c(true);
                tf0Var.s0.u1(0, true, null, true);
                break;
            default:
                this.b.s0.u1(0, true, null, true);
                break;
        }
    }
}
