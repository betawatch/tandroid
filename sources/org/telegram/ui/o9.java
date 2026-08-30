package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                v9 v9Var = (v9) this.b;
                o1.j jVar = v9Var.x;
                if (jVar != null) {
                    jVar.c();
                    v9Var.x = null;
                    break;
                }
                break;
            case 1:
                fo0 fo0Var = (fo0) this.b;
                if (hVar == fo0Var.c) {
                    fo0Var.c = null;
                    break;
                }
                break;
            default:
                ((tt0) this.b).D();
                break;
        }
    }
}
