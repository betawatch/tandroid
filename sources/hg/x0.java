package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 implements Utilities.Callback {
    public final /* synthetic */ b1 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ x0(b1 b1Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = b1Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        b1 b1Var = this.a;
        b1Var.dismiss();
        if (this.b == null) {
            AndroidUtilities.runOnUIThread(new gf.c(10, b1Var, this.e), 220L);
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            xn R9 = xn.R9(this.c);
            R9.whenFullyVisible(new y0(R9, this.d, 0));
            U.presentFragment(R9);
        }
    }
}
