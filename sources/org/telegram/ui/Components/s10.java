package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class s10 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public s10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.n2 n2Var = fragmentContextView.h;
        if (fragmentContextView.f0 == null || !(n2Var instanceof org.telegram.ui.yn)) {
            fragmentContextView.k0 = false;
            return;
        }
        ChatObject.Call groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.isScheduled()) {
            fragmentContextView.g0 = false;
            fragmentContextView.k0 = false;
            return;
        }
        int currentTime = groupCall.call.schedule_date - n2Var.getConnectionsManager().getCurrentTime();
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
