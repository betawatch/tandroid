package lh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.qb;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ d(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        q qVar = this.b;
        switch (i10) {
            case 0:
                d dVar = qVar.k0;
                int currentTime = qVar.getConnectionsManager().getCurrentTime();
                qVar.O.setEnabled(qVar.M > 0 || qVar.D > currentTime);
                if (currentTime >= qVar.D) {
                    qVar.O.f(null, true);
                    qVar.O.g(ja.V0(false, qVar.L ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) qVar.M), qVar.Q), true, true);
                    break;
                } else {
                    qVar.O.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (qVar.j0 == null) {
                        qVar.j0 = new SpannableStringBuilder("l");
                        mq mqVar = new mq(R.drawable.mini_switch_lock, 0);
                        mqVar.setTopOffset(1);
                        qVar.j0.setSpan(mqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) qVar.j0).append((CharSequence) q.j0(qVar.D - currentTime));
                    qVar.O.f(spannableStringBuilder, true);
                    ic icVar = qVar.X;
                    if (icVar != null) {
                        nb nbVar = icVar.e;
                        if ((nbVar instanceof qb) && nbVar.isAttachedToWindow()) {
                            org.telegram.ui.b.o(R.string.BotStarsWithdrawalToast, new Object[]{q.j0(qVar.D - currentTime)}, ((qb) qVar.X.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 1000L);
                    break;
                }
                break;
            case 1:
                q.U(qVar);
                break;
            case 2:
                q.V(qVar);
                break;
            case 3:
                af.g.s(qVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                af.g.s(qVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                qVar.P.setLoading(false);
                break;
        }
    }
}
