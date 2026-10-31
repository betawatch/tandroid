package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f8 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ f8(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    o8.Y(this.b);
                    break;
                }
                break;
            default:
                o8 o8Var = this.b;
                if (i10 == -1) {
                    o8.Y(o8Var);
                }
                if (i10 == 1) {
                    o8Var.j0();
                    break;
                }
                break;
        }
    }
}
