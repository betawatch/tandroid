package bi;

import org.telegram.messenger.us;
import org.telegram.ui.Components.tu0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements tu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;

    public /* synthetic */ s1(us usVar, int i10) {
        this.a = i10;
        this.b = usVar;
    }

    @Override // org.telegram.ui.Components.tu0
    public final void K(int i10, boolean z10) {
        switch (this.a) {
            case 0:
                ((k2) this.b).getClass();
                break;
            default:
                xh.d2 d2Var = ((xh.m2) this.b).x;
                if (i10 > org.telegram.messenger.i0.L(20.0f)) {
                    d2Var.e(d2Var.getTopActionBarOffsetY() + (-d2Var.getOffsetY()));
                    break;
                }
                break;
        }
    }
}
