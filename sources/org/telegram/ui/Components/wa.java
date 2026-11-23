package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                fc fcVar = (fc) this.b;
                Float f10 = (Float) obj;
                eb ebVar = fcVar.p;
                if (ebVar != null) {
                    if (!fcVar.e.top) {
                        ebVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                ri riVar = ((ti) this.b).X3;
                if (riVar != null) {
                    riVar.O0(obj);
                    break;
                }
                break;
        }
    }
}
