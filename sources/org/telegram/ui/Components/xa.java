package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                gc gcVar = (gc) this.b;
                Float f10 = (Float) obj;
                fb fbVar = gcVar.p;
                if (fbVar != null) {
                    if (!gcVar.e.top) {
                        fbVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                ii iiVar = ((ki) this.b).V1;
                if (iiVar != null) {
                    iiVar.A(obj);
                    break;
                }
                break;
        }
    }
}
