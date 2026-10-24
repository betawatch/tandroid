package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                w9 w9Var = (w9) this.b;
                o1.k kVar = w9Var.y;
                if (kVar != null) {
                    kVar.c();
                    w9Var.y = null;
                    break;
                }
                break;
            case 1:
                eo0 eo0Var = (eo0) this.b;
                if (hVar == eo0Var.c) {
                    eo0Var.c = null;
                    break;
                }
                break;
            default:
                ((xt0) this.b).E();
                break;
        }
    }
}
