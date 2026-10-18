package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jp0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ rp0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ jp0(rp0 rp0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = rp0Var;
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
                rp0 rp0Var = this.b;
                if (!z10) {
                    rp0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    rp0Var.getClass();
                    break;
                }
        }
    }
}
