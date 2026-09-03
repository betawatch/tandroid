package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                    jiVar.Z0(obj);
                    break;
                }
                break;
        }
    }
}
