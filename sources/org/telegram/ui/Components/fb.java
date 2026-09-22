package org.telegram.ui.Components;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
