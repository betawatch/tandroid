package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ma(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                wb wbVar = (wb) this.b;
                Float f7 = (Float) obj;
                ua uaVar = wbVar.p;
                if (uaVar != null) {
                    if (!wbVar.e.top) {
                        uaVar.c(r0.getHeight() - f7.floatValue());
                        break;
                    }
                }
                break;
            default:
                ai aiVar = ((bi) this.b).T3;
                if (aiVar != null) {
                    aiVar.n0(obj);
                    break;
                }
                break;
        }
    }
}
