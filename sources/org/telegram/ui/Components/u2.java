package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u2 implements org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.q20 b;
    public final /* synthetic */ boolean[] c;

    public /* synthetic */ u2(int i10, org.telegram.messenger.q20 q20Var, boolean[] zArr) {
        this.a = i10;
        this.b = q20Var;
        this.c = zArr;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.a) {
            case 0:
                this.b.a(Boolean.valueOf(this.c[0]));
                break;
            default:
                this.b.a(Boolean.TRUE);
                this.c[0] = true;
                x1Var.dismiss();
                break;
        }
    }
}
