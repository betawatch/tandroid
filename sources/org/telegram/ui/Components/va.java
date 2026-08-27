package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class va implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ va(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ec ecVar = (ec) this.b;
                Float f10 = (Float) obj;
                db dbVar = ecVar.p;
                if (dbVar != null) {
                    if (!ecVar.e.top) {
                        dbVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                ei eiVar = ((gi) this.b).V1;
                if (eiVar != null) {
                    eiVar.I(obj);
                    break;
                }
                break;
        }
    }
}
