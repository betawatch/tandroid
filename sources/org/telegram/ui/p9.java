package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                o1.k kVar = w9Var.y;
                if (kVar != null) {
                    kVar.c();
                    w9Var.y = null;
                    break;
                }
                break;
            case 1:
                eo0 eo0Var = (eo0) this.b;
                if (hVar == eo0Var.c) {
                    eo0Var.c = null;
                    break;
                }
                break;
            default:
                ((xt0) this.b).E();
                break;
        }
    }
}
