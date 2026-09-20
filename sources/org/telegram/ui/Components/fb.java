package org.telegram.ui.Components;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class fb implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                pc pcVar = (pc) this.b;
                Float f7 = (Float) obj;
                nb nbVar = pcVar.p;
                if (nbVar != null) {
                    if (!pcVar.e.top) {
                        nbVar.c(r0.getHeight() - f7.floatValue());
                        break;
                    }
                }
                break;
            default:
                ti tiVar = ((vi) this.b).Z1;
                if (tiVar != null) {
                    tiVar.V0(obj);
                    break;
                }
                break;
        }
    }
}
