package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                v9 v9Var = (v9) this.b;
                o1.k kVar = v9Var.y;
                if (kVar != null) {
                    kVar.c();
                    v9Var.y = null;
                    break;
                }
                break;
            case 1:
                ro0 ro0Var = (ro0) this.b;
                if (hVar == ro0Var.c) {
                    ro0Var.c = null;
                    break;
                }
                break;
            default:
                ((pu0) this.b).D();
                break;
        }
    }
}
