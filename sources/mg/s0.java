package mg;

import org.telegram.messenger.q20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements q20 {
    public final /* synthetic */ w0 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ s0(long j10, long j11, w0 w0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway) {
        this.a = w0Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        w0 w0Var = this.a;
        w0Var.dismiss();
        if (this.b == null) {
            org.telegram.messenger.i0.h3(new k2.u(28, w0Var, this.e), 220L);
            return;
        }
        k2 T = LaunchActivity.T();
        if (T != null) {
            un ha = un.ha(this.c);
            ha.whenFullyVisible(new t0(ha, this.d, 0));
            T.presentFragment(ha);
        }
    }
}
