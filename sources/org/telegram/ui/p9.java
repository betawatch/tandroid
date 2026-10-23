package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
