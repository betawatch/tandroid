package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ je b;
    public final /* synthetic */ int c;

    public /* synthetic */ md(je jeVar, int i10, int i11) {
        this.a = i11;
        this.b = jeVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        je jeVar = this.b;
        switch (i10) {
            case 0:
                nf.f.s(jeVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                md mdVar = jeVar.i1;
                fi.o oVar = jeVar.Y0;
                org.telegram.ui.Components.oc.e();
                if (jeVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    jeVar.W0 = true;
                    jeVar.X0 = jeVar.N0.amount;
                } else {
                    jeVar.W0 = false;
                    jeVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                jeVar.V0 = true;
                oVar.setText(Long.toString(jeVar.X0));
                oVar.setSelection(oVar.getText().length());
                jeVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(mdVar);
                mdVar.run();
                break;
            default:
                md mdVar2 = jeVar.i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ae aeVar = jeVar.Q0;
                aeVar.setEnabled(jeVar.X0 > 0 || jeVar.L0 > currentTime);
                if (currentTime >= jeVar.L0) {
                    aeVar.f(null, true);
                    aeVar.g(yh.x7.V0(false, jeVar.W0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) jeVar.X0), jeVar.R0), true, true);
                    break;
                } else {
                    aeVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (jeVar.h1 == null) {
                        jeVar.h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                        oqVar.setTopOffset(1);
                        jeVar.h1.setSpan(oqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) jeVar.h1).append((CharSequence) yh.g.j0(jeVar.L0 - currentTime));
                    aeVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.oc ocVar = jeVar.Z0;
                    if (ocVar != null) {
                        org.telegram.ui.Components.sb sbVar = ocVar.e;
                        if ((sbVar instanceof org.telegram.ui.Components.wb) && sbVar.isAttachedToWindow()) {
                            org.telegram.messenger.vl.q(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(jeVar.L0 - currentTime)}, ((org.telegram.ui.Components.wb) jeVar.Z0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(mdVar2);
                    AndroidUtilities.runOnUIThread(mdVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
