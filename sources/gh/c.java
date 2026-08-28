package gh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ob;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ c(r rVar, int i9) {
        this.a = i9;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        r rVar = this.b;
        switch (i9) {
            case 0:
                c cVar = rVar.j0;
                int currentTime = rVar.getConnectionsManager().getCurrentTime();
                rVar.N.setEnabled(rVar.L > 0 || rVar.C > currentTime);
                if (currentTime >= rVar.C) {
                    rVar.N.f(null, true);
                    rVar.N.g(oa.V0(false, rVar.K ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) rVar.L), rVar.P), true, true);
                    break;
                } else {
                    rVar.N.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (rVar.i0 == null) {
                        rVar.i0 = new SpannableStringBuilder("l");
                        eq eqVar = new eq(R.drawable.mini_switch_lock, 0);
                        eqVar.setTopOffset(1);
                        rVar.i0.setSpan(eqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) rVar.i0).append((CharSequence) r.i0(rVar.C - currentTime));
                    rVar.N.f(spannableStringBuilder, true);
                    gc gcVar = rVar.W;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.e;
                        if ((lbVar instanceof ob) && lbVar.isAttachedToWindow()) {
                            ll.q(R.string.BotStarsWithdrawalToast, new Object[]{r.i0(rVar.C - currentTime)}, ((ob) rVar.W.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar, 1000L);
                    break;
                }
                break;
            case 1:
                r.T(rVar);
                break;
            case 2:
                r.U(rVar);
                break;
            case 3:
                ve.e.s(rVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                ve.e.s(rVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                rVar.O.setLoading(false);
                break;
        }
    }
}
