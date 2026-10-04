package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class gp0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ op0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ gp0(op0 op0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = op0Var;
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
                op0 op0Var = this.b;
                if (!z10) {
                    op0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    op0Var.getClass();
                    break;
                }
        }
    }
}
