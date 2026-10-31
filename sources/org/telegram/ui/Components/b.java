package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements org.telegram.messenger.qc {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ b(g0 g0Var, int i10) {
        this.a = i10;
        this.b = g0Var;
    }

    @Override // org.telegram.messenger.qc
    public final void a(String str) {
        switch (this.a) {
            case 0:
                g0 g0Var = this.b;
                g0Var.j2 = str;
                g0Var.G2.O(true);
                break;
            default:
                g0 g0Var2 = this.b;
                g0Var2.j2 = str;
                g0Var2.G2.O(true);
                break;
        }
    }
}
