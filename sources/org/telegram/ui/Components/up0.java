package org.telegram.ui.Components;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class up0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ up0(cq0 cq0Var, o1.j jVar, int i10) {
        this.a = i10;
        this.b = cq0Var;
        this.c = jVar;
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
                cq0 cq0Var = this.b;
                if (!z10) {
                    cq0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    cq0Var.getClass();
                    break;
                }
        }
    }
}
