package di;

import bi.ab;
import org.telegram.messenger.voip.Instance;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
