package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sa implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sa(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                cc ccVar = (cc) this.b;
                Float f10 = (Float) obj;
                ab abVar = ccVar.p;
                if (abVar != null) {
                    if (!ccVar.e.top) {
                        abVar.c(r0.getHeight() - f10.floatValue());
                        break;
                    }
                }
                break;
            default:
                bi biVar = ((di) this.b).T3;
                if (biVar != null) {
                    biVar.M0(obj);
                    break;
                }
                break;
        }
    }
}
