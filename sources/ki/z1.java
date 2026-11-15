package ki;

import org.telegram.messenger.is;
import org.telegram.ui.Components.rt0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements rt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ is b;

    public /* synthetic */ z1(is isVar, int i7) {
        this.a = i7;
        this.b = isVar;
    }

    @Override // org.telegram.ui.Components.rt0
    public final void L(int i7, boolean z10) {
        switch (this.a) {
            case 0:
                o2 o2Var = ((x2) this.b).x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    o2Var.e(o2Var.getTopActionBarOffsetY() + (-o2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((oi.z1) this.b).getClass();
                break;
        }
    }
}
