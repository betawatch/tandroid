package org.telegram.ui.Components;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class op0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ wp0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ op0(wp0 wp0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = wp0Var;
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
                wp0 wp0Var = this.b;
                if (!z10) {
                    wp0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    wp0Var.getClass();
                    break;
                }
        }
    }
}
