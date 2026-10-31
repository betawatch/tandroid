package og;

import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.r8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends e {
    @Override // og.e, og.d
    public final void d() {
        this.c.setLayoutParams(b6.d(40, 40.0f, (cd.X ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z10 = cd.X;
        this.d.setLayoutParams(b6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 69.0f, 0.0f, z10 ? 69.0f : 20.0f, 0.0f));
        boolean z11 = cd.X;
        this.e.setLayoutParams(b6.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 69.0f, 0.0f, z11 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        a7.Y(this.e, t6.r5, this.a);
        boolean z10 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        c cVar = this.d;
        r8 r8Var = this.b;
        if (z10) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            r8Var.g(26);
            cVar.k(cd.H(',', "BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(cd.G(tL_prepaidStarsGiveaway.quantity, "AmongWinners", new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            cVar.k(cd.L0(2131753328, null));
            r8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                r8Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                r8Var.i(-10703110, -12481584);
            } else {
                r8Var.i(-6631068, -11945404);
            }
            setSubtitle(cd.G(prepaidGiveaway.quantity, "BoostingPreparedGiveawaySubscriptionsPlural", cd.G(tL_prepaidGiveaway.months, "Months", new Object[0])));
        }
        g9 g9Var = this.c;
        g9Var.setImageDrawable(r8Var);
        g9Var.setRoundRadius(i0.L(20.0f));
    }
}
