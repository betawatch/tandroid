package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                u9 u9Var = (u9) this.b;
                o1.j jVar2 = u9Var.D;
                if (jVar2 != null) {
                    jVar2.d();
                    u9Var.D = null;
                    break;
                }
                break;
            case 1:
                om0 om0Var = (om0) this.b;
                if (jVar == om0Var.c) {
                    om0Var.c = null;
                    break;
                }
                break;
            default:
                ((tr0) this.b).E();
                break;
        }
    }
}
