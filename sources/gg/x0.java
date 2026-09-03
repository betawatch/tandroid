package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            AndroidUtilities.runOnUIThread(new ff.c(8, b1Var, this.e), 220L);
            return;
        }
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            zn R9 = zn.R9(this.c);
            R9.whenFullyVisible(new y0(R9, this.d, 0));
            U.presentFragment(R9);
        }
    }
}
