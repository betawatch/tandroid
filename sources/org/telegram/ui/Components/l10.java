package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l10 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public l10(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.o2 o2Var = fragmentContextView.h;
        if (fragmentContextView.b0 == null || !(o2Var instanceof org.telegram.ui.tn)) {
            fragmentContextView.g0 = false;
            return;
        }
        ChatObject.Call groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.isScheduled()) {
            fragmentContextView.c0 = false;
            fragmentContextView.g0 = false;
            return;
        }
        int currentTime = groupCall.call.schedule_date - o2Var.getConnectionsManager().getCurrentTime();
        String formatPluralString = currentTime >= 86400 ? LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]) : AndroidUtilities.formatFullDuration(currentTime);
        n6 n6Var = fragmentContextView.e0;
        if (!fragmentContextView.d0) {
            formatPluralString = LocaleController.getString(R.string.VoipChatNotify);
        }
        n6Var.q(formatPluralString, true, true);
        AndroidUtilities.runOnUIThread(fragmentContextView.h0, 1000L);
        fragmentContextView.r.invalidate();
    }
}
