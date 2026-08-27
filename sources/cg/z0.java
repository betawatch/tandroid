package cg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Utilities.Callback {
    public final /* synthetic */ d1 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ z0(d1 d1Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = d1Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        d1 d1Var = this.a;
        d1Var.dismiss();
        if (this.b == null) {
            AndroidUtilities.runOnUIThread(new a1.e(25, d1Var, this.e), 220L);
            return;
        }
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            rn R9 = rn.R9(this.c);
            R9.whenFullyVisible(new a1(R9, this.d, 0));
            U.presentFragment(R9);
        }
    }
}
