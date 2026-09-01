package eg;

import org.telegram.ui.ht0;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ ht0 b;

    public /* synthetic */ n(ht0 ht0Var, int i10) {
        this.a = i10;
        this.b = ht0Var;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                c1.Z(this.b, (Integer) obj);
                break;
            default:
                c1.c0(this.b, (Integer) obj);
                break;
        }
    }
}
