package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class od implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;
    public final /* synthetic */ int c;

    public /* synthetic */ od(le leVar, int i10, int i11) {
        this.a = i11;
        this.b = leVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        le leVar = this.b;
        switch (i10) {
            case 0:
                nf.f.s(leVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                od odVar = leVar.i1;
                fi.o oVar = leVar.Y0;
                org.telegram.ui.Components.oc.e();
                if (leVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    leVar.W0 = true;
                    leVar.X0 = leVar.N0.amount;
                } else {
                    leVar.W0 = false;
                    leVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                leVar.V0 = true;
                oVar.setText(Long.toString(leVar.X0));
                oVar.setSelection(oVar.getText().length());
                leVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(odVar);
                odVar.run();
                break;
            default:
                od odVar2 = leVar.i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ce ceVar = leVar.Q0;
                ceVar.setEnabled(leVar.X0 > 0 || leVar.L0 > currentTime);
                if (currentTime >= leVar.L0) {
                    ceVar.f(null, true);
                    ceVar.g(yh.y7.V0(false, leVar.W0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) leVar.X0), leVar.R0), true, true);
                    break;
                } else {
                    ceVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (leVar.h1 == null) {
                        leVar.h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(R.drawable.mini_switch_lock, 0);
                        oqVar.setTopOffset(1);
                        leVar.h1.setSpan(oqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) leVar.h1).append((CharSequence) yh.g.j0(leVar.L0 - currentTime));
                    ceVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.oc ocVar = leVar.Z0;
                    if (ocVar != null) {
                        org.telegram.ui.Components.sb sbVar = ocVar.e;
                        if ((sbVar instanceof org.telegram.ui.Components.wb) && sbVar.isAttachedToWindow()) {
                            org.telegram.messenger.wl.p(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(leVar.L0 - currentTime)}, ((org.telegram.ui.Components.wb) leVar.Z0.e).b);
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
