package di;

import bi.ab;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f1 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ g1 a;

    public f1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i7, boolean z9) {
        g1 g1Var = this.a;
        boolean m10 = g1Var.m();
        g1Var.D = i7;
        org.telegram.messenger.a8.b("[LivePlayer] connectionState = " + i7);
        if (m10 != g1Var.m()) {
            org.telegram.messenger.g0.h3(new ab(this, 16));
        }
    }
}
