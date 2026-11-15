package ki;

import org.telegram.messenger.is;
import org.telegram.ui.Components.rt0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
