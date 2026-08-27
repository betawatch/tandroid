package hh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mb;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ c(r rVar, int i10) {
        this.a = i10;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        r rVar = this.b;
        switch (i10) {
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
                        cq cqVar = new cq(R.drawable.mini_switch_lock, 0);
                        cqVar.setTopOffset(1);
                        rVar.i0.setSpan(cqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) rVar.i0).append((CharSequence) r.j0(rVar.C - currentTime));
                    rVar.N.f(spannableStringBuilder, true);
                    ec ecVar = rVar.W;
                    if (ecVar != null) {
                        org.telegram.ui.Components.jb jbVar = ecVar.e;
                        if ((jbVar instanceof mb) && jbVar.isAttachedToWindow()) {
                            rl.n(R.string.BotStarsWithdrawalToast, new Object[]{r.j0(rVar.C - currentTime)}, ((mb) rVar.W.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar, 1000L);
                    break;
                }
                break;
            case 1:
                r.U(rVar);
                break;
            case 2:
                r.V(rVar);
                break;
            case 3:
                we.e.s(rVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                we.e.s(rVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                rVar.O.setLoading(false);
                break;
        }
    }
}
