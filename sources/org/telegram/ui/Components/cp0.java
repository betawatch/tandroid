package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class cp0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ cp0(kp0 kp0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = kp0Var;
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
                kp0 kp0Var = this.b;
                if (!z10) {
                    kp0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    kp0Var.getClass();
                    break;
                }
        }
    }
}
