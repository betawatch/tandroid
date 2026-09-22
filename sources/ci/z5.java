package ci;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class z5 extends t2 {
    public final /* synthetic */ int H;
    public final /* synthetic */ r6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(r6 r6Var, Context context, e6 e6Var, int i10) {
        super(context, e6Var, false, false);
        this.I = r6Var;
        this.H = i10;
    }

    @Override // ci.t2
    public final boolean l0(Integer num) {
        k6 k6Var = this.I.R0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < k6Var.getChildCount(); i11++) {
                if (k6Var.getChildAt(i11) instanceof qg.b2) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new org.telegram.ui.Components.xc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.j6.gc, 0, new androidx.fragment.app.a0(this, 10), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new org.telegram.ui.Components.xc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override // ci.t2
    public final boolean m0(Integer num) {
        r6 r6Var = this.I;
        k6 k6Var = r6Var.R0;
        boolean z10 = false;
        if (r6Var.X1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= k6Var.getChildCount()) {
                    break;
                }
                if (k6Var.getChildAt(i10) instanceof qg.w2) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            return !z10;
        }
        return true;
    }

    @Override // ci.t2
    public final boolean n0(ai.n8 n8Var) {
        return this.I.f0(n8Var);
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.I.R0(this.H);
    }
}
