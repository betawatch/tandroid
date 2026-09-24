package org.telegram.ui.Components;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ap0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ ip0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ ap0(ip0 ip0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = ip0Var;
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
                ip0 ip0Var = this.b;
                if (!z10) {
                    ip0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    ip0Var.getClass();
                    break;
                }
        }
    }
}
