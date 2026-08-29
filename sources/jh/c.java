package jh;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.ub;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q b;

    public /* synthetic */ c(q qVar, int i10) {
        this.a = i10;
        this.b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        q qVar = this.b;
        switch (i10) {
            case 0:
                c cVar = qVar.j0;
                int currentTime = qVar.getConnectionsManager().getCurrentTime();
                qVar.N.setEnabled(qVar.L > 0 || qVar.C > currentTime);
                if (currentTime >= qVar.C) {
                    qVar.N.f(null, true);
                    qVar.N.g(ia.V0(false, qVar.K ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) qVar.L), qVar.P), true, true);
                    break;
                } else {
                    qVar.N.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (qVar.i0 == null) {
                        qVar.i0 = new SpannableStringBuilder("l");
                        iq iqVar = new iq(R.drawable.mini_switch_lock, 0);
                        iqVar.setTopOffset(1);
                        qVar.i0.setSpan(iqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) qVar.i0).append((CharSequence) q.j0(qVar.C - currentTime));
                    qVar.N.f(spannableStringBuilder, true);
                    mc mcVar = qVar.W;
                    if (mcVar != null) {
                        rb rbVar = mcVar.e;
                        if ((rbVar instanceof ub) && rbVar.isAttachedToWindow()) {
                            org.telegram.ui.b.p(R.string.BotStarsWithdrawalToast, new Object[]{q.j0(qVar.C - currentTime)}, ((ub) qVar.W.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    AndroidUtilities.runOnUIThread(cVar, 1000L);
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
                ye.d.s(qVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                ye.d.s(qVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                qVar.O.setLoading(false);
                break;
        }
    }
}
