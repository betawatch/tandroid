package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ int c;

    public /* synthetic */ od(ke keVar, int i10, int i11) {
        this.a = i11;
        this.b = keVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        ke keVar = this.b;
        switch (i10) {
            case 0:
                af.g.s(keVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                od odVar = keVar.f1;
                lh.n nVar = keVar.V0;
                org.telegram.ui.Components.ic.e();
                if (keVar.K0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    keVar.T0 = true;
                    keVar.U0 = keVar.K0.amount;
                } else {
                    keVar.T0 = false;
                    keVar.U0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                keVar.S0 = true;
                nVar.setText(Long.toString(keVar.U0));
                nVar.setSelection(nVar.getText().length());
                keVar.S0 = false;
                AndroidUtilities.cancelRunOnUIThread(odVar);
                odVar.run();
                break;
            default:
                od odVar2 = keVar.f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                be beVar = keVar.N0;
                beVar.setEnabled(keVar.U0 > 0 || keVar.I0 > currentTime);
                if (currentTime >= keVar.I0) {
                    beVar.f(null, true);
                    beVar.g(lh.ja.V0(false, keVar.T0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) keVar.U0), keVar.O0), true, true);
                    break;
                } else {
                    beVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (keVar.e1 == null) {
                        keVar.e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(R.drawable.mini_switch_lock, 0);
                        mqVar.setTopOffset(1);
                        keVar.e1.setSpan(mqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) keVar.e1).append((CharSequence) lh.q.j0(keVar.I0 - currentTime));
                    beVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.ic icVar = keVar.W0;
                    if (icVar != null) {
                        org.telegram.ui.Components.nb nbVar = icVar.e;
                        if ((nbVar instanceof org.telegram.ui.Components.qb) && nbVar.isAttachedToWindow()) {
                            b.o(R.string.BotStarsWithdrawalToast, new Object[]{lh.q.j0(keVar.I0 - currentTime)}, ((org.telegram.ui.Components.qb) keVar.W0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(odVar2);
                    AndroidUtilities.runOnUIThread(odVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
