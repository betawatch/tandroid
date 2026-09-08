package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                ti tiVar = ((vi) this.b).Z1;
                if (tiVar != null) {
                    tiVar.K(obj);
                    break;
                }
                break;
        }
    }
}
