package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class q10 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public q10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (fragmentContextView.f0 == null || !(m2Var instanceof org.telegram.ui.wn)) {
            fragmentContextView.k0 = false;
            return;
        }
        ChatObject.Call groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.isScheduled()) {
            fragmentContextView.g0 = false;
            fragmentContextView.k0 = false;
            return;
        }
        int currentTime = groupCall.call.schedule_date - m2Var.getConnectionsManager().getCurrentTime();
        String formatPluralString = currentTime >= 86400 ? LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]) : AndroidUtilities.formatFullDuration(currentTime);
        o6 o6Var = fragmentContextView.i0;
        if (!fragmentContextView.h0) {
            formatPluralString = LocaleController.getString(R.string.VoipChatNotify);
        }
        o6Var.q(formatPluralString, true, true);
        AndroidUtilities.runOnUIThread(fragmentContextView.l0, 1000L);
        fragmentContextView.r.invalidate();
    }
}
