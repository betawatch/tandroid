package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                mc mcVar = (mc) this.b;
                Float f9 = (Float) obj;
                kb kbVar = mcVar.p;
                if (kbVar != null) {
                    if (!mcVar.e.top) {
                        kbVar.c(r0.getHeight() - f9.floatValue());
                        break;
                    }
                }
                break;
            default:
                li liVar = ((ni) this.b).V1;
                if (liVar != null) {
                    liVar.U0(obj);
                    break;
                }
                break;
        }
    }
}
