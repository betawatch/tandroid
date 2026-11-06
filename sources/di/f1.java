package di;

import bi.ab;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
