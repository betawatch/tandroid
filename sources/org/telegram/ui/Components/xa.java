package org.telegram.ui.Components;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ic icVar = (ic) this.b;
                Float f10 = (Float) obj;
                fb fbVar = icVar.p;
                if (fbVar != null) {
                    if (!icVar.e.top) {
                        fbVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                ji jiVar = ((li) this.b).W1;
                if (jiVar != null) {
                    jiVar.D(obj);
                    break;
                }
                break;
        }
    }
}
