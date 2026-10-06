package org.telegram.ui.Components;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
