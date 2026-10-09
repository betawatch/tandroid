package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sp0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ sp0(aq0 aq0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = aq0Var;
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
                aq0 aq0Var = this.b;
                if (!z10) {
                    aq0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    aq0Var.getClass();
                    break;
                }
        }
    }
}
