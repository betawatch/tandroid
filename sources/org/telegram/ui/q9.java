package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                x9 x9Var = (x9) this.b;
                o1.j jVar = x9Var.x;
                if (jVar != null) {
                    jVar.c();
                    x9Var.x = null;
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
