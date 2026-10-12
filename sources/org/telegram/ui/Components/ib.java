package org.telegram.ui.Components;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ib(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                sc scVar = (sc) this.b;
                Float f7 = (Float) obj;
                qb qbVar = scVar.p;
                if (qbVar != null) {
                    if (!scVar.e.top) {
                        qbVar.c(r0.getHeight() - f7.floatValue());
                        break;
                    }
                }
                break;
            default:
                ti tiVar = ((vi) this.b).c2;
                if (tiVar != null) {
                    tiVar.U(obj);
                    break;
                }
                break;
        }
    }
}
