package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                ((vt0) this.b).D();
                break;
        }
    }
}
