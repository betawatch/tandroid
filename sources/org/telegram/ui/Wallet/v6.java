package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class v6 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                a7.b((a7) this.b, z10, f7);
                break;
            default:
                r9 r9Var = (r9) this.b;
                r9Var.a0 = null;
                r9Var.b0 = 1.0f;
                r9Var.F0();
                break;
        }
    }
}
