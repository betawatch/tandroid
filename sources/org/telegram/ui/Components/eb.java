package org.telegram.ui.Components;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                oc ocVar = (oc) this.b;
                Float f7 = (Float) obj;
                mb mbVar = ocVar.p;
                if (mbVar != null) {
                    if (!ocVar.e.top) {
                        mbVar.c(r0.getHeight() - f7.floatValue());
                        break;
                    }
                }
                break;
            default:
                ti tiVar = ((vi) this.b).Z1;
                if (tiVar != null) {
                    tiVar.U0(obj);
                    break;
                }
                break;
        }
    }
}
