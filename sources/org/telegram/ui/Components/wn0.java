package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ wn0(eo0 eo0Var, o1.j jVar, int i9) {
        this.a = i9;
        this.b = eo0Var;
        this.c = jVar;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    hVar.c();
                    break;
                }
                break;
            default:
                eo0 eo0Var = this.b;
                if (!z10) {
                    eo0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    eo0Var.getClass();
                    break;
                }
        }
    }
}
