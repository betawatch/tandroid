package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
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
                qd qdVar = meVar.i2;
                fi.o oVar = meVar.R1;
                org.telegram.ui.Components.rc.e();
                if (meVar.G1.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    meVar.P1 = true;
                    meVar.Q1 = meVar.G1.amount;
                } else {
                    meVar.P1 = false;
                    meVar.Q1 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                meVar.O1 = true;
                oVar.setText(Long.toString(meVar.Q1));
                oVar.setSelection(oVar.getText().length());
                meVar.O1 = false;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
                break;
            default:
                qd qdVar2 = meVar.i2;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ce ceVar = meVar.J1;
                ceVar.setEnabled(meVar.Q1 > 0 || meVar.E1 > currentTime);
                if (currentTime >= meVar.E1) {
                    ceVar.f(null, true);
                    ceVar.g(yh.x7.b1(false, meVar.P1 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) meVar.Q1), meVar.K1), true, true);
                    break;
                } else {
                    ceVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (meVar.h2 == null) {
                        meVar.h2 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(R.drawable.mini_switch_lock, 0);
                        rqVar.setTopOffset(1);
                        meVar.h2.setSpan(rqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) meVar.h2).append((CharSequence) yh.g.j0(meVar.E1 - currentTime));
                    ceVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.rc rcVar = meVar.S1;
                    if (rcVar != null) {
                        org.telegram.ui.Components.vb vbVar = rcVar.e;
                        if ((vbVar instanceof org.telegram.ui.Components.zb) && vbVar.isAttachedToWindow()) {
                            org.telegram.messenger.ok.q(R.string.BotStarsWithdrawalToast, new Object[]{yh.g.j0(meVar.E1 - currentTime)}, ((org.telegram.ui.Components.zb) meVar.S1.e).b);
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
