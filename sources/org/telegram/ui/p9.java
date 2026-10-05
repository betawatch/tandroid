package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                oo0 oo0Var = (oo0) this.b;
                if (hVar == oo0Var.c) {
                    oo0Var.c = null;
                    break;
                }
                break;
            default:
                ((ju0) this.b).E();
                break;
        }
    }
}
