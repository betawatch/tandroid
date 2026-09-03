package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                ho0 ho0Var = (ho0) this.b;
                if (hVar == ho0Var.c) {
                    ho0Var.c = null;
                    break;
                }
                break;
            default:
                ((au0) this.b).D();
                break;
        }
    }
}
