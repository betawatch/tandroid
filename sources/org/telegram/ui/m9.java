package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                t9 t9Var = (t9) this.b;
                o1.j jVar = t9Var.x;
                if (jVar != null) {
                    jVar.c();
                    t9Var.x = null;
                    break;
                }
                break;
            case 1:
                zn0 zn0Var = (zn0) this.b;
                if (hVar == zn0Var.c) {
                    zn0Var.c = null;
                    break;
                }
                break;
            default:
                ((nt0) this.b).D();
                break;
        }
    }
}
