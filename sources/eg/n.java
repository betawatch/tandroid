package eg;

import org.telegram.ui.mt0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements q0.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ mt0 b;

    public /* synthetic */ n(mt0 mt0Var, int i10) {
        this.a = i10;
        this.b = mt0Var;
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
