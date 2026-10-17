package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;
    public final /* synthetic */ int c;

    public /* synthetic */ pd(ke keVar, int i10, int i11) {
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
                pf.d.r(keVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                pd pdVar = keVar.i1;
                ai.t tVar = keVar.Y0;
                org.telegram.ui.Components.qc.e();
                if (keVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    keVar.W0 = true;
                    keVar.X0 = keVar.N0.amount;
                } else {
                    keVar.W0 = false;
                    keVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                keVar.V0 = true;
                tVar.setText(Long.toString(keVar.X0));
                tVar.setSelection(tVar.getText().length());
                keVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                pdVar.run();
                break;
            default:
                pd pdVar2 = keVar.i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                be beVar = keVar.Q0;
                beVar.setEnabled(keVar.X0 > 0 || keVar.L0 > currentTime);
                if (currentTime >= keVar.L0) {
                    beVar.f(null, true);
                    beVar.g(ai.ld.W0(false, keVar.W0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) keVar.X0), keVar.R0), true, true);
                    break;
                } else {
                    beVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (keVar.h1 == null) {
                        keVar.h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.mini_switch_lock, 0);
                        yqVar.setTopOffset(1);
                        keVar.h1.setSpan(yqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) keVar.h1).append((CharSequence) ai.x.j0(keVar.L0 - currentTime));
                    beVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = keVar.Z0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.wh.r(R.string.BotStarsWithdrawalToast, new Object[]{ai.x.j0(keVar.L0 - currentTime)}, ((org.telegram.ui.Components.yb) keVar.Z0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(pdVar2);
                    AndroidUtilities.runOnUIThread(pdVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
