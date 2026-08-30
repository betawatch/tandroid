package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ ro0(zo0 zo0Var, o1.j jVar, int i10) {
        this.a = i10;
        this.b = zo0Var;
        this.c = jVar;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z4) {
                    this.b.z.remove(this.c);
                    hVar.c();
                    break;
                }
                break;
            default:
                zo0 zo0Var = this.b;
                if (!z4) {
                    zo0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    zo0Var.getClass();
                    break;
                }
        }
    }
}
