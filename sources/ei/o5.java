package ei;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class o5 extends n2 {
    public final /* synthetic */ int H;
    public final /* synthetic */ f6 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(f6 f6Var, Context context, t5 t5Var, int i10) {
        super(context, t5Var, false, false);
        this.I = f6Var;
        this.H = i10;
    }

    @Override // ei.n2
    public final boolean m0(Integer num) {
        z5 z5Var = this.I.R0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < z5Var.getChildCount(); i11++) {
                if (z5Var.getChildAt(i11) instanceof rg.b2) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new xc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.h6.gc, 0, new com.google.firebase.messaging.s(this, 10), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new xc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override // ei.n2
    public final boolean n0(Integer num) {
        f6 f6Var = this.I;
        z5 z5Var = f6Var.R0;
        boolean z10 = false;
        if (f6Var.X1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= z5Var.getChildCount()) {
                    break;
                }
                if (z5Var.getChildAt(i10) instanceof rg.w2) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            return !z10;
        }
        return true;
    }

    @Override // ei.n2
    public final boolean o0(Runnable runnable) {
        vb vbVar = ((xa) this.I).A2;
        Activity activity = vbVar.b;
        if (activity == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (activity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_AUDIO"}, 115);
            vbVar.y2 = (ah.g) runnable;
            return false;
        }
        if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 115);
        vbVar.y2 = (ah.g) runnable;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.I.Q0(this.H);
    }
}
