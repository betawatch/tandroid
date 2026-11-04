package ei;

import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f1 implements Instance.OnStateUpdatedListener {
    public final /* synthetic */ g1 a;

    public f1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // org.telegram.messenger.voip.Instance.OnStateUpdatedListener
    public final void onStateUpdated(int i3, boolean z10) {
        g1 g1Var = this.a;
        boolean m10 = g1Var.m();
        g1Var.E = i3;
        org.telegram.messenger.a8.b("[LivePlayer] connectionState = " + i3);
        if (m10 != g1Var.m()) {
            org.telegram.messenger.g0.h3(new ci.d1(this, 22));
        }
    }
}
