package ai;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.nk;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                    xVar.R.f(null, true);
                    xVar.R.g(md.W0(false, xVar.O ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) xVar.P), xVar.T), true, true);
                    break;
                } else {
                    xVar.R.g(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (xVar.m0 == null) {
                        xVar.m0 = new SpannableStringBuilder("l");
                        yq yqVar = new yq(R.drawable.mini_switch_lock, 0);
                        yqVar.setTopOffset(1);
                        xVar.m0.setSpan(yqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) xVar.m0).append((CharSequence) x.j0(xVar.G - currentTime));
                    xVar.R.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = xVar.a0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            nk.r(R.string.BotStarsWithdrawalToast, new Object[]{x.j0(xVar.G - currentTime)}, ((org.telegram.ui.Components.yb) xVar.a0.e).b);
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
