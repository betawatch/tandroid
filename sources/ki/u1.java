package ki;

import org.telegram.messenger.gs;
import org.telegram.ui.Components.cu0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class u1 implements cu0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gs b;

    public /* synthetic */ u1(gs gsVar, int i7) {
        this.a = i7;
        this.b = gsVar;
    }

    @Override // org.telegram.ui.Components.cu0
    public final void L(int i7, boolean z10) {
        switch (this.a) {
            case 0:
                j2 j2Var = ((s2) this.b).x;
                if (i7 > org.telegram.messenger.g0.L(20.0f)) {
                    j2Var.e(j2Var.getTopActionBarOffsetY() + (-j2Var.getOffsetY()));
                    break;
                }
                break;
            default:
                ((oi.b2) this.b).getClass();
                break;
        }
    }
}
