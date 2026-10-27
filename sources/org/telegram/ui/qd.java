package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ int c;

    public /* synthetic */ qd(ke keVar, int i10, int i11) {
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
                qf.d.r(keVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                qd qdVar = keVar.f1;
                bi.t tVar = keVar.O0;
                org.telegram.ui.Components.qc.e();
                if (keVar.D0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    keVar.M0 = true;
                    keVar.N0 = keVar.D0.amount;
                } else {
                    keVar.M0 = false;
                    keVar.N0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                keVar.L0 = true;
                tVar.setText(Long.toString(keVar.N0));
                tVar.setSelection(tVar.getText().length());
                keVar.L0 = false;
                AndroidUtilities.cancelRunOnUIThread(qdVar);
                qdVar.run();
                break;
            default:
                qd qdVar2 = keVar.f1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                ae aeVar = keVar.G0;
                aeVar.setEnabled(keVar.N0 > 0 || keVar.B0 > currentTime);
                if (currentTime >= keVar.B0) {
                    aeVar.g(null, true);
                    aeVar.i(bi.dd.U0(false, keVar.M0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) keVar.N0), keVar.H0), true, true);
                    break;
                } else {
                    aeVar.i(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (keVar.e1 == null) {
                        keVar.e1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(R.drawable.mini_switch_lock, 0);
                        zqVar.setTopOffset(1);
                        keVar.e1.setSpan(zqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) keVar.e1).append((CharSequence) bi.y.s0(keVar.B0 - currentTime));
                    aeVar.g(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = keVar.P0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.wh.o(R.string.BotStarsWithdrawalToast, new Object[]{bi.y.s0(keVar.B0 - currentTime)}, ((org.telegram.ui.Components.yb) keVar.P0.e).b);
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
