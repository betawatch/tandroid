package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ de b;
    public final /* synthetic */ int c;

    public /* synthetic */ id(de deVar, int i10, int i11) {
        this.a = i11;
        this.b = deVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        de deVar = this.b;
        switch (i10) {
            case 0:
                ye.d.s(deVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                id idVar = deVar.e1;
                jh.m mVar = deVar.U0;
                org.telegram.ui.Components.mc.e();
                if (deVar.J0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    deVar.S0 = true;
                    deVar.T0 = deVar.J0.amount;
                } else {
                    deVar.S0 = false;
                    deVar.T0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                deVar.R0 = true;
                mVar.setText(Long.toString(deVar.T0));
                mVar.setSelection(mVar.getText().length());
                deVar.R0 = false;
                AndroidUtilities.cancelRunOnUIThread(idVar);
                idVar.run();
                break;
            default:
                id idVar2 = deVar.e1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ud udVar = deVar.M0;
                udVar.setEnabled(deVar.T0 > 0 || deVar.H0 > currentTime);
                if (currentTime >= deVar.H0) {
                    udVar.f(null, true);
                    udVar.g(jh.ia.V0(false, deVar.S0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) deVar.T0), deVar.N0), true, true);
                    break;
                } else {
                    udVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (deVar.d1 == null) {
                        deVar.d1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(R.drawable.mini_switch_lock, 0);
                        iqVar.setTopOffset(1);
                        deVar.d1.setSpan(iqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) deVar.d1).append((CharSequence) jh.q.j0(deVar.H0 - currentTime));
                    udVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.mc mcVar = deVar.V0;
                    if (mcVar != null) {
                        org.telegram.ui.Components.rb rbVar = mcVar.e;
                        if ((rbVar instanceof org.telegram.ui.Components.ub) && rbVar.isAttachedToWindow()) {
                            b.p(R.string.BotStarsWithdrawalToast, new Object[]{jh.q.j0(deVar.H0 - currentTime)}, ((org.telegram.ui.Components.ub) deVar.V0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(idVar2);
                    AndroidUtilities.runOnUIThread(idVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
