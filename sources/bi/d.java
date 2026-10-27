package bi;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.zq;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y b;

    public /* synthetic */ d(y yVar, int i10) {
        this.a = i10;
        this.b = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        y yVar = this.b;
        switch (i10) {
            case 0:
                d dVar = yVar.s0;
                int currentTime = yVar.getConnectionsManager().getCurrentTime();
                yVar.a0.setEnabled(yVar.Y > 0 || yVar.P > currentTime);
                if (currentTime >= yVar.P) {
                    yVar.a0.g(null, true);
                    yVar.a0.i(dd.U0(false, yVar.X ? LocaleController.getString(R.string.BotStarsButtonWithdrawShortAll) : LocaleController.formatPluralStringSpaced("BotStarsButtonWithdrawShort", (int) yVar.Y), yVar.c0), true, true);
                    break;
                } else {
                    yVar.a0.i(LocaleController.getString(R.string.BotStarsButtonWithdrawShortUntil), true, true);
                    if (yVar.r0 == null) {
                        yVar.r0 = new SpannableStringBuilder("l");
                        zq zqVar = new zq(R.drawable.mini_switch_lock, 0);
                        zqVar.setTopOffset(1);
                        yVar.r0.setSpan(zqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) yVar.r0).append((CharSequence) y.s0(yVar.P - currentTime));
                    yVar.a0.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = yVar.j0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            wh.o(R.string.BotStarsWithdrawalToast, new Object[]{y.s0(yVar.P - currentTime)}, ((org.telegram.ui.Components.yb) yVar.j0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    AndroidUtilities.runOnUIThread(dVar, 1000L);
                    break;
                }
                break;
            case 1:
                y.X(yVar);
                break;
            case 2:
                qf.d.r(yVar.getParentActivity(), LocaleController.getString(R.string.BotStarsWithdrawInfoLink));
                break;
            case 3:
                y.V(yVar);
                break;
            case 4:
                qf.d.r(yVar.getParentActivity(), LocaleController.getString(R.string.BotMonetizationBalanceInfoLink));
                break;
            default:
                yVar.b0.setLoading(false);
                break;
        }
    }
}
