package jg;

import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class f extends e {
    @Override // jg.e, jg.d
    public final void d() {
        this.c.setLayoutParams(c6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        boolean z4 = LocaleController.isRTL;
        this.d.setLayoutParams(c6.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 20.0f : 69.0f, 0.0f, z4 ? 69.0f : 20.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        this.e.setLayoutParams(c6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 69.0f, 0.0f, z10 ? 69.0f : 20.0f, 0.0f));
    }

    public void setGiveaway(TL_stories.PrepaidGiveaway prepaidGiveaway) {
        this.e.setTextColor(k6.v0(k6.r5, this.a));
        boolean z4 = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway;
        c cVar = this.d;
        z8 z8Var = this.b;
        if (z4) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
            z8Var.g(26);
            cVar.k(LocaleController.formatPluralStringComma("BoostingStarsPreparedGiveawaySubscriptionsPlural", (int) tL_prepaidStarsGiveaway.stars));
            setSubtitle(LocaleController.formatPluralString("AmongWinners", tL_prepaidStarsGiveaway.quantity, new Object[0]));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
            cVar.k(LocaleController.getString(R.string.BoostingPreparedGiveawayOne));
            z8Var.g(16);
            TL_stories.TL_prepaidGiveaway tL_prepaidGiveaway = (TL_stories.TL_prepaidGiveaway) prepaidGiveaway;
            int i10 = tL_prepaidGiveaway.months;
            if (i10 == 12) {
                z8Var.i(-31392, -2796986);
            } else if (i10 == 6) {
                z8Var.i(-10703110, -12481584);
            } else {
                z8Var.i(-6631068, -11945404);
            }
            setSubtitle(LocaleController.formatPluralString("BoostingPreparedGiveawaySubscriptionsPlural", prepaidGiveaway.quantity, LocaleController.formatPluralString("Months", tL_prepaidGiveaway.months, new Object[0])));
        }
        p9 p9Var = this.c;
        p9Var.setImageDrawable(z8Var);
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
    }
}
