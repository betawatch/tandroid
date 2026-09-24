package org.telegram.ui;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
                ko0 ko0Var = (ko0) this.b;
                if (hVar == ko0Var.c) {
                    ko0Var.c = null;
                    break;
                }
                break;
            default:
                ((gu0) this.b).D();
                break;
        }
    }
}
