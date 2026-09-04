package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                u9 u9Var = (u9) this.b;
                o1.k kVar = u9Var.x;
                if (kVar != null) {
                    kVar.c();
                    u9Var.x = null;
                    break;
                }
                break;
            case 1:
                to0 to0Var = (to0) this.b;
                if (hVar == to0Var.c) {
                    to0Var.c = null;
                    break;
                }
                break;
            default:
                ((nu0) this.b).D();
                break;
        }
    }
}
