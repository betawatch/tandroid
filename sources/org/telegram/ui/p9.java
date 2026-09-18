package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                w9 w9Var = (w9) this.b;
                o1.k kVar = w9Var.x;
                if (kVar != null) {
                    kVar.c();
                    w9Var.x = null;
                    break;
                }
                break;
            case 1:
                uo0 uo0Var = (uo0) this.b;
                if (hVar == uo0Var.c) {
                    uo0Var.c = null;
                    break;
                }
                break;
            default:
                ((qu0) this.b).D();
                break;
        }
    }
}
