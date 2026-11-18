package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                t9 t9Var = (t9) this.b;
                r1.g gVar2 = t9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    t9Var.E = null;
                    break;
                }
                break;
            case 1:
                il0 il0Var = (il0) this.b;
                if (gVar == il0Var.c) {
                    il0Var.c = null;
                    break;
                }
                break;
            default:
                ((jq0) this.b).E();
                break;
        }
    }
}
