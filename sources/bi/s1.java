package bi;

import org.telegram.messenger.vs;
import org.telegram.ui.Components.uu0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements uu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs b;

    public /* synthetic */ s1(vs vsVar, int i10) {
        this.a = i10;
        this.b = vsVar;
    }

    @Override // org.telegram.ui.Components.uu0
    public final void L(int i10, boolean z10) {
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
