package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ me b;
    public final /* synthetic */ int c;

    public /* synthetic */ qd(me meVar, int i10, int i11) {
        this.a = i11;
        this.b = meVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        me meVar = this.b;
        switch (i10) {
            case 0:
                ze.d.s(meVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                qd qdVar = meVar.f1;
                lh.n nVar = meVar.V0;
                org.telegram.ui.Components.ic.e();
                if (meVar.K0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    meVar.T0 = true;
                    meVar.U0 = meVar.K0.amount;
                } else {
                    meVar.T0 = false;
                    meVar.U0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                meVar.S0 = true;
                nVar.setText(Long.toString(meVar.U0));
                nVar.setSelection(nVar.getText().length());
                meVar.S0 = false;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
                break;
            default:
                qd qdVar2 = meVar.f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                de deVar = meVar.N0;
                deVar.setEnabled(meVar.U0 > 0 || meVar.I0 > currentTime);
                if (currentTime >= meVar.I0) {
                    deVar.f(null, true);
                    deVar.g(lh.ja.V0(false, meVar.T0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) meVar.U0), meVar.O0), true, true);
                    break;
                } else {
                    deVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (meVar.e1 == null) {
                        meVar.e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(R.drawable.mini_switch_lock, 0);
                        lqVar.setTopOffset(1);
                        meVar.e1.setSpan(lqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) meVar.e1).append((CharSequence) lh.q.j0(meVar.I0 - currentTime));
                    deVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.ic icVar = meVar.W0;
                    if (icVar != null) {
                        org.telegram.ui.Components.nb nbVar = icVar.e;
                        if ((nbVar instanceof org.telegram.ui.Components.qb) && nbVar.isAttachedToWindow()) {
                            b.o(R.string.BotStarsWithdrawalToast, new Object[]{lh.q.j0(meVar.I0 - currentTime)}, ((org.telegram.ui.Components.qb) meVar.W0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(qdVar2);
                    AndroidUtilities.runOnUIThread(qdVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
