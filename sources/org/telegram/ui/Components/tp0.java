package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tp0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ bq0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ tp0(bq0 bq0Var, o1.j jVar, int i10) {
        this.a = i10;
        this.b = bq0Var;
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
                bq0 bq0Var = this.b;
                if (!z10) {
                    bq0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    bq0Var.getClass();
                    break;
                }
        }
    }
}
