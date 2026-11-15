package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class oa implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                xb xbVar = (xb) this.b;
                Float f10 = (Float) obj;
                wa waVar = xbVar.p;
                if (waVar != null) {
                    if (!xbVar.e.top) {
                        waVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                ii iiVar = ((ki) this.b).X3;
                if (iiVar != null) {
                    iiVar.R0(obj);
                    break;
                }
                break;
        }
    }
}
