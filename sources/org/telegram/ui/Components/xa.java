package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xa implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ic icVar = (ic) this.b;
                Float f10 = (Float) obj;
                fb fbVar = icVar.p;
                if (fbVar != null) {
                    if (!icVar.e.top) {
                        fbVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                ki kiVar = ((mi) this.b).W1;
                if (kiVar != null) {
                    kiVar.Z0(obj);
                    break;
                }
                break;
        }
    }
}
