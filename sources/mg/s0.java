package mg;

import org.telegram.messenger.r20;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements r20 {
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

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        w0 w0Var = this.a;
        w0Var.dismiss();
        if (this.b == null) {
            org.telegram.messenger.i0.h3(new k2.u(28, w0Var, this.e), 220L);
            return;
        }
        k2 T = LaunchActivity.T();
        if (T != null) {
            un ma2 = un.ma(this.c);
            ma2.whenFullyVisible(new t0(ma2, this.d, 0));
            T.presentFragment(ma2);
        }
    }
}
