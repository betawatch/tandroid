package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                qc qcVar = (qc) this.b;
                Float f7 = (Float) obj;
                ob obVar = qcVar.p;
                if (obVar != null) {
                    if (!qcVar.e.top) {
                        obVar.c(r0.getHeight() - f7.floatValue());
                        break;
                    }
                }
                break;
            default:
                ri riVar = ((ti) this.b).c2;
                if (riVar != null) {
                    riVar.O(obj);
                    break;
                }
                break;
        }
    }
}
