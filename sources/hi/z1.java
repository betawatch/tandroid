package hi;

import org.telegram.messenger.ls;
import org.telegram.ui.Components.st0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final /* synthetic */ class z1 implements st0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ls b;

    public /* synthetic */ z1(ls lsVar, int i7) {
        this.a = i7;
        this.b = lsVar;
    }

    @Override // org.telegram.ui.Components.st0
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
