package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe b;
    public final /* synthetic */ int c;

    public /* synthetic */ jd(fe feVar, int i10, int i11) {
        this.a = i11;
        this.b = feVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        fe feVar = this.b;
        switch (i10) {
            case 0:
                we.e.s(feVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                jd jdVar = feVar.e1;
                hh.o oVar = feVar.U0;
                org.telegram.ui.Components.ec.e();
                if (feVar.J0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    feVar.S0 = true;
                    feVar.T0 = feVar.J0.amount;
                } else {
                    feVar.S0 = false;
                    feVar.T0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                feVar.R0 = true;
                oVar.setText(Long.toString(feVar.T0));
                oVar.setSelection(oVar.getText().length());
                feVar.R0 = false;
                AndroidUtilities.cancelRunOnUIThread(jdVar);
                jdVar.run();
                break;
            default:
                jd jdVar2 = feVar.e1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                wd wdVar = feVar.M0;
                wdVar.setEnabled(feVar.T0 > 0 || feVar.H0 > currentTime);
                if (currentTime >= feVar.H0) {
                    wdVar.f(null, true);
                    wdVar.g(hh.oa.V0(false, feVar.S0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) feVar.T0), feVar.N0), true, true);
                    break;
                } else {
                    wdVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (feVar.d1 == null) {
                        feVar.d1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(R.drawable.mini_switch_lock, 0);
                        cqVar.setTopOffset(1);
                        feVar.d1.setSpan(cqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) feVar.d1).append((CharSequence) hh.r.j0(feVar.H0 - currentTime));
                    wdVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.ec ecVar = feVar.V0;
                    if (ecVar != null) {
                        org.telegram.ui.Components.jb jbVar = ecVar.e;
                        if ((jbVar instanceof org.telegram.ui.Components.mb) && jbVar.isAttachedToWindow()) {
                            org.telegram.messenger.rl.n(R.string.BotStarsWithdrawalToast, new Object[]{hh.r.j0(feVar.H0 - currentTime)}, ((org.telegram.ui.Components.mb) feVar.V0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(jdVar2);
                    AndroidUtilities.runOnUIThread(jdVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
