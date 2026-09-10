package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                ei.o oVar = leVar.Y0;
                org.telegram.ui.Components.pc.e();
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
                    ceVar.g(xh.z7.V0(false, leVar.W0 ? LocaleController.getString(R.string.MonetizationStarsWithdrawAll) : LocaleController.formatPluralStringSpaced("MonetizationStarsWithdraw", (int) leVar.X0), leVar.R0), true, true);
                    break;
                } else {
                    ceVar.g(LocaleController.getString(R.string.MonetizationStarsWithdrawUntil), true, true);
                    if (leVar.h1 == null) {
                        leVar.h1 = new SpannableStringBuilder("l");
                        org.telegram.ui.Components.uq uqVar = new org.telegram.ui.Components.uq(R.drawable.mini_switch_lock, 0);
                        uqVar.setTopOffset(1);
                        leVar.h1.setSpan(uqVar, 0, 1, 33);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) leVar.h1).append((CharSequence) xh.h.j0(leVar.L0 - currentTime));
                    ceVar.f(spannableStringBuilder, true);
                    org.telegram.ui.Components.pc pcVar = leVar.Z0;
                    if (pcVar != null) {
                        org.telegram.ui.Components.tb tbVar = pcVar.e;
                        if ((tbVar instanceof org.telegram.ui.Components.xb) && tbVar.isAttachedToWindow()) {
                            org.telegram.messenger.em.p(R.string.BotStarsWithdrawalToast, new Object[]{xh.h.j0(leVar.L0 - currentTime)}, ((org.telegram.ui.Components.xb) leVar.Z0.e).b);
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
