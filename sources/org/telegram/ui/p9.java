package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
                y9 y9Var = (y9) this.b;
                o1.k kVar = y9Var.E;
                if (kVar != null) {
                    kVar.c();
                    y9Var.E = null;
                    break;
                }
                break;
            case 1:
                co0 co0Var = (co0) this.b;
                if (hVar == co0Var.c) {
                    co0Var.c = null;
                    break;
                }
                break;
            default:
                ((wt0) this.b).D();
                break;
        }
    }
}
