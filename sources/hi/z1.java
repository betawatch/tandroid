package hi;

import org.telegram.messenger.ls;
import org.telegram.ui.Components.qt0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements qt0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;

    public /* synthetic */ z1(ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
    }

    @Override // org.telegram.ui.Components.qt0
    public final void K(int i7, boolean z9) {
        switch (this.a) {
            case 0:
                r2 r2Var = ((a3) this.b).x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    r2Var.e(r2Var.getTopActionBarOffsetY() + (-r2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((li.b2) this.b).getClass();
                break;
        }
    }
}
