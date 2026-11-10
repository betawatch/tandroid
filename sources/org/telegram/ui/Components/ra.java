package org.telegram.ui.Components;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ra implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ra(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                bc bcVar = (bc) this.b;
                Float f10 = (Float) obj;
                za zaVar = bcVar.p;
                if (zaVar != null) {
                    if (!bcVar.e.top) {
                        zaVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                ai aiVar = ((ci) this.b).W3;
                if (aiVar != null) {
                    aiVar.M0(obj);
                    break;
                }
                break;
        }
    }
}
