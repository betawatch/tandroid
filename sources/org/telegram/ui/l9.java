package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l9(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                s9 s9Var = (s9) this.b;
                o1.j jVar = s9Var.x;
                if (jVar != null) {
                    jVar.c();
                    s9Var.x = null;
                    break;
                }
                break;
            case 1:
                yn0 yn0Var = (yn0) this.b;
                if (hVar == yn0Var.c) {
                    yn0Var.c = null;
                    break;
                }
                break;
            default:
                ((mt0) this.b).D();
                break;
        }
    }
}
