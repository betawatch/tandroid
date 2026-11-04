package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ac acVar = (ac) this.b;
                Float f10 = (Float) obj;
                za zaVar = acVar.p;
                if (zaVar != null) {
                    if (!acVar.e.top) {
                        zaVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                zh zhVar = ((bi) this.b).U3;
                if (zhVar != null) {
                    zhVar.I0(obj);
                    break;
                }
                break;
        }
    }
}
