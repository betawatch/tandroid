package org.telegram.ui.Components;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                rc rcVar = (rc) this.b;
                Float f7 = (Float) obj;
                pb pbVar = rcVar.p;
                if (pbVar != null) {
                    if (!rcVar.e.top) {
                        pbVar.c(r0.getHeight() - f7.floatValue());
                        break;
                    }
                }
                break;
            default:
                vi viVar = ((xi) this.b).Z1;
                if (viVar != null) {
                    viVar.U0(obj);
                    break;
                }
                break;
        }
    }
}
