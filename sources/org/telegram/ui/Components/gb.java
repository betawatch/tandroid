package org.telegram.ui.Components;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
                ui uiVar = ((wi) this.b).Z1;
                if (uiVar != null) {
                    uiVar.U0(obj);
                    break;
                }
                break;
        }
    }
}
