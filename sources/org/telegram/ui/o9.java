package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                v9 v9Var = (v9) this.b;
                o1.k kVar = v9Var.x;
                if (kVar != null) {
                    kVar.c();
                    v9Var.x = null;
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
                ((ou0) this.b).D();
                break;
        }
    }
}
