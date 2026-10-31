package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class un0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ co0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ un0(co0 co0Var, o1.j jVar, int i10) {
        this.a = i10;
        this.b = co0Var;
        this.c = jVar;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    jVar.d();
                    break;
                }
                break;
            default:
                co0 co0Var = this.b;
                if (!z10) {
                    co0Var.z.remove(this.c);
                    jVar.d();
                    break;
                } else {
                    co0Var.getClass();
                    break;
                }
        }
    }
}
