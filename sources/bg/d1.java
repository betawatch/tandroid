package bg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Utilities.Callback {
    public final /* synthetic */ h1 a;
    public final /* synthetic */ TL_stories.TL_prepaidStarsGiveaway b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ TL_stories.PrepaidGiveaway e;

    public /* synthetic */ d1(h1 h1Var, TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway, long j10, long j11, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.a = h1Var;
        this.b = tL_prepaidStarsGiveaway;
        this.c = j10;
        this.d = j11;
        this.e = prepaidGiveaway;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        h1 h1Var = this.a;
        h1Var.dismiss();
        if (this.b == null) {
            AndroidUtilities.runOnUIThread(new a1.e(15, h1Var, this.e), 220L);
            return;
        }
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            qn R9 = qn.R9(this.c);
            R9.whenFullyVisible(new e1(R9, this.d, 0));
            U.presentFragment(R9);
        }
    }
}
