package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                mo0 mo0Var = (mo0) this.b;
                if (hVar == mo0Var.c) {
                    mo0Var.c = null;
                    break;
                }
                break;
            default:
                ((hu0) this.b).D();
                break;
        }
    }
}
