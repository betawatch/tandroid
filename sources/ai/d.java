package ai;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.sl;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x b;

    public /* synthetic */ d(x xVar, int i10) {
        this.a = i10;
        this.b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        x xVar = this.b;
        switch (i10) {
            case 0:
                d dVar = xVar.n0;
                int currentTime = xVar.getConnectionsManager().getCurrentTime();
                xVar.R.setEnabled(xVar.P > 0 || xVar.G > currentTime);
                if (currentTime >= xVar.G) {
                    xVar.R.g(null, true);
                    xVar.R.i(nd.W0(false, xVar.O ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) xVar.P), xVar.T), true, true);
                    break;
                } else {
                    xVar.R.i(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (xVar.m0 == null) {
                        xVar.m0 = new SpannableStringBuilder("l");
                        xq xqVar = new xq(R.drawable.mini_switch_lock, 0);
                        xqVar.setTopOffset(1);
                        xVar.m0.setSpan(xqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) xVar.m0).append((CharSequence) x.j0(xVar.G - currentTime));
                    xVar.R.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = xVar.a0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            sl.r(R.string.BotStarsWithdrawalToast, new Object[]{x.j0(xVar.G - currentTime)}, ((org.telegram.ui.Components.yb) xVar.a0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 1000L);
                    break;
                }
                break;
            case 1:
                x.U(xVar);
                break;
            case 2:
                x.V(xVar);
                break;
            case 3:
                pf.d.r(xVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            case 4:
                pf.d.r(xVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            default:
                xVar.S.setLoading(false);
                break;
        }
    }
}
