package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                wi wiVar = ((yi) this.b).Z1;
                if (wiVar != null) {
                    wiVar.U0(obj);
                    break;
                }
                break;
        }
    }
}
