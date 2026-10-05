package org.telegram.ui.Components;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hp0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ pp0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ hp0(pp0 pp0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = pp0Var;
        this.c = kVar;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    hVar.c();
                    break;
                }
                break;
            default:
                pp0 pp0Var = this.b;
                if (!z10) {
                    pp0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    pp0Var.getClass();
                    break;
                }
        }
    }
}
