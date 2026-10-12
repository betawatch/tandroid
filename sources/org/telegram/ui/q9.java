package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                z9 z9Var = (z9) this.b;
                o1.k kVar = z9Var.y;
                if (kVar != null) {
                    kVar.c();
                    z9Var.y = null;
                    break;
                }
                break;
            case 1:
                yo0 yo0Var = (yo0) this.b;
                if (hVar == yo0Var.c) {
                    yo0Var.c = null;
                    break;
                }
                break;
            default:
                ((vu0) this.b).D();
                break;
        }
    }
}
