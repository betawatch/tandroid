package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fe b;
    public final /* synthetic */ int c;

    public /* synthetic */ jd(fe feVar, int i9, int i10) {
        this.a = i10;
        this.b = feVar;
        this.c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9 = this.a;
        int i10 = this.c;
        fe feVar = this.b;
        switch (i9) {
            case 0:
                ve.e.s(feVar.getContext(), LocaleController.getString(i10));
                break;
            case 1:
                jd jdVar = feVar.e1;
                gh.o oVar = feVar.U0;
                org.telegram.ui.Components.gc.e();
                if (feVar.J0.amount < MessagesController.getInstance(i10).starsRevenueWithdrawalMin) {
                    feVar.S0 = true;
                    feVar.T0 = feVar.J0.amount;
                } else {
                    feVar.S0 = false;
                    feVar.T0 = MessagesController.getInstance(i10).starsRevenueWithdrawalMin;
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
                int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                wd wdVar = feVar.M0;
                wdVar.setEnabled(feVar.T0 > 0 || feVar.H0 > currentTime);
                if (currentTime >= feVar.H0) {
                    wdVar.f(null, true);
                    wdVar.g(gh.oa.V0(false, feVar.S0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) feVar.T0), feVar.N0), true, true);
                    break;
                } else {
                    wdVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (feVar.d1 == null) {
                        feVar.d1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(R.drawable.mini_switch_lock, 0);
                        eqVar.setTopOffset(1);
                        feVar.d1.setSpan(eqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) feVar.d1).append((CharSequence) gh.r.i0(feVar.H0 - currentTime));
                    wdVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.gc gcVar = feVar.V0;
                    if (gcVar != null) {
                        org.telegram.ui.Components.lb lbVar = gcVar.e;
                        if ((lbVar instanceof org.telegram.ui.Components.ob) && lbVar.isAttachedToWindow()) {
                            org.telegram.messenger.ll.q(R.string.BotStarsWithdrawalToast, new Object[]{gh.r.i0(feVar.H0 - currentTime)}, ((org.telegram.ui.Components.ob) feVar.V0.e).b);
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
