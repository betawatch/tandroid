package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class q10 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public q10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.p2 p2Var = fragmentContextView.h;
        if (fragmentContextView.c0 == null || !(p2Var instanceof org.telegram.ui.xn)) {
            fragmentContextView.h0 = false;
            return;
        }
        ChatObject.Call groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.isScheduled()) {
            fragmentContextView.d0 = false;
            fragmentContextView.h0 = false;
            return;
        }
        int currentTime = groupCall.call.schedule_date - p2Var.getConnectionsManager().getCurrentTime();
        String formatPluralString = currentTime >= 86400 ? LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]) : AndroidUtilities.formatFullDuration(currentTime);
        j6 j6Var = fragmentContextView.f0;
        if (!fragmentContextView.e0) {
            formatPluralString = LocaleController.getString(R.string.VoipChatNotify);
        }
        j6Var.q(formatPluralString, true, true);
        AndroidUtilities.runOnUIThread(fragmentContextView.i0, 1000L);
        fragmentContextView.r.invalidate();
    }
}
