package mh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.qb;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;

    public /* synthetic */ c(p pVar, int i10) {
        this.a = i10;
        this.b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        p pVar = this.b;
        switch (i10) {
            case 0:
                c cVar = pVar.k0;
                int currentTime = pVar.getConnectionsManager().getCurrentTime();
                pVar.O.setEnabled(pVar.M > 0 || pVar.D > currentTime);
                if (currentTime >= pVar.D) {
                    pVar.O.f(null, true);
                    pVar.O.g(ja.V0(false, pVar.L ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) pVar.M), pVar.Q), true, true);
                    break;
                } else {
                    pVar.O.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (pVar.j0 == null) {
                        pVar.j0 = new SpannableStringBuilder("l");
                        oq oqVar = new oq(R.drawable.mini_switch_lock, 0);
                        oqVar.setTopOffset(1);
                        pVar.j0.setSpan(oqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) pVar.j0).append((CharSequence) p.j0(pVar.D - currentTime));
                    pVar.O.f(spannableStringBuilder, true);
                    ic icVar = pVar.X;
                    if (icVar != null) {
                        nb nbVar = icVar.e;
                        if ((nbVar instanceof qb) && nbVar.isAttachedToWindow()) {
                            org.telegram.ui.b.o(R.string.BotStarsWithdrawalToast, new Object[]{p.j0(pVar.D - currentTime)}, ((qb) pVar.X.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar, 1000L);
                    break;
                }
                break;
            case 1:
                p.U(pVar);
                break;
            case 2:
                p.V(pVar);
                break;
            case 3:
                af.g.s(pVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                af.g.s(pVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                pVar.P.setLoading(false);
                break;
        }
    }
}
