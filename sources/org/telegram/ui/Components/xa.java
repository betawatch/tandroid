package org.telegram.ui.Components;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i7) {
        this.a = i7;
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
                si siVar = ((ui) this.b).X3;
                if (siVar != null) {
                    siVar.R0(obj);
                    break;
                }
                break;
        }
    }
}
