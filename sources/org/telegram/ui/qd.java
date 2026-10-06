package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
                nf.f.s(meVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                qd qdVar = meVar.f1;
                fi.o oVar = meVar.O0;
                org.telegram.ui.Components.rc.e();
                if (meVar.D0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    meVar.M0 = true;
                    meVar.N0 = meVar.D0.amount;
                } else {
                    meVar.M0 = false;
                    meVar.N0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                meVar.L0 = true;
                oVar.setText(Long.toString(meVar.N0));
                oVar.setSelection(oVar.getText().length());
                meVar.L0 = false;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
                break;
            default:
                qd qdVar2 = meVar.f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ce ceVar = meVar.G0;
                ceVar.setEnabled(meVar.N0 > 0 || meVar.B0 > currentTime);
                if (currentTime >= meVar.B0) {
                    ceVar.f(null, true);
                    ceVar.g(yh.z7.b1(false, meVar.M0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) meVar.N0), meVar.H0), true, true);
                    break;
                } else {
                    ceVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (meVar.e1 == null) {
                        meVar.e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.mini_switch_lock, 0);
                        rqVar.setTopOffset(1);
                        meVar.e1.setSpan(rqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) meVar.e1).append((CharSequence) yh.h.r0(meVar.B0 - currentTime));
                    ceVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.rc rcVar = meVar.P0;
                    if (rcVar != null) {
                        org.telegram.ui.Components.vb vbVar = rcVar.e;
                        if ((vbVar instanceof org.telegram.ui.Components.zb) && vbVar.isAttachedToWindow()) {
                            org.telegram.messenger.bi.p(R.string.BotStarsWithdrawalToast, new Object[]{yh.h.r0(meVar.B0 - currentTime)}, ((org.telegram.ui.Components.zb) meVar.P0.e).b);
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
