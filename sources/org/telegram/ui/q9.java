package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                wo0 wo0Var = (wo0) this.b;
                if (hVar == wo0Var.c) {
                    wo0Var.c = null;
                    break;
                }
                break;
            default:
                ((uu0) this.b).D();
                break;
        }
    }
}
