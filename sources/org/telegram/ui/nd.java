package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie b;
    public final /* synthetic */ int c;

    public /* synthetic */ nd(ie ieVar, int i10, int i11) {
        this.a = i11;
        this.b = ieVar;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = this.c;
        ie ieVar = this.b;
        switch (i10) {
            case 0:
                pf.d.r(ieVar.getContext(), LocaleController.getString(i11));
                break;
            case 1:
                nd ndVar = ieVar.i1;
                ai.t tVar = ieVar.Y0;
                org.telegram.ui.Components.qc.e();
                if (ieVar.N0.amount < MessagesController.getInstance(i11).starsRevenueWithdrawalMin) {
                    ieVar.W0 = true;
                    ieVar.X0 = ieVar.N0.amount;
                } else {
                    ieVar.W0 = false;
                    ieVar.X0 = MessagesController.getInstance(i11).starsRevenueWithdrawalMin;
                }
                ieVar.V0 = true;
                tVar.setText(Long.toString(ieVar.X0));
                tVar.setSelection(tVar.getText().length());
                ieVar.V0 = false;
                AndroidUtilities.cancelRunOnUIThread(ndVar);
                ndVar.run();
                break;
            default:
                nd ndVar2 = ieVar.i1;
                int currentTime = ConnectionsManager.getInstance(i11).getCurrentTime();
                zd zdVar = ieVar.Q0;
                zdVar.setEnabled(ieVar.X0 > 0 || ieVar.L0 > currentTime);
                if (currentTime >= ieVar.L0) {
                    zdVar.f(null, true);
                    zdVar.g(ai.md.W0(false, ieVar.W0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) ieVar.X0), ieVar.R0), true, true);
                    break;
                } else {
                    zdVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (ieVar.h1 == null) {
                        ieVar.h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.yq yqVar = new org.telegram.ui.Components.yq(R.drawable.mini_switch_lock, 0);
                        yqVar.setTopOffset(1);
                        ieVar.h1.setSpan(yqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) ieVar.h1).append((CharSequence) ai.x.j0(ieVar.L0 - currentTime));
                    zdVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.qc qcVar = ieVar.Z0;
                    if (qcVar != null) {
                        org.telegram.ui.Components.ub ubVar = qcVar.e;
                        if ((ubVar instanceof org.telegram.ui.Components.yb) && ubVar.isAttachedToWindow()) {
                            org.telegram.messenger.mk.r(R.string.BotStarsWithdrawalToast, new Object[]{ai.x.j0(ieVar.L0 - currentTime)}, ((org.telegram.ui.Components.yb) ieVar.Z0.e).b);
                        }
                    }
                    AndroidUtilities.cancelRunOnUIThread(ndVar2);
                    AndroidUtilities.runOnUIThread(ndVar2, 1000L);
                    break;
                }
                break;
        }
    }
}
