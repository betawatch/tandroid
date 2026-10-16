package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b20 implements Runnable {
    public final /* synthetic */ FragmentContextView a;

    public b20(FragmentContextView fragmentContextView) {
        this.a = fragmentContextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentContextView fragmentContextView = this.a;
        org.telegram.ui.ActionBar.m2 m2Var = fragmentContextView.h;
        if (fragmentContextView.g0 == null || !(m2Var instanceof org.telegram.ui.fo)) {
            fragmentContextView.l0 = false;
            return;
        }
        ChatObject.Call groupCall = fragmentContextView.n.getGroupCall();
        if (groupCall == null || !groupCall.isScheduled()) {
            fragmentContextView.h0 = false;
            fragmentContextView.l0 = false;
            return;
        }
        int currentTime = groupCall.call.schedule_date - m2Var.getConnectionsManager().getCurrentTime();
        String formatPluralString = currentTime >= 86400 ? LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]) : AndroidUtilities.formatFullDuration(currentTime);
        r6 r6Var = fragmentContextView.j0;
        if (!fragmentContextView.i0) {
            formatPluralString = LocaleController.getString(R.string.VoipChatNotify);
        }
        r6Var.t(formatPluralString, true, true);
        AndroidUtilities.runOnUIThread(fragmentContextView.m0, 1000L);
        fragmentContextView.s.invalidate();
    }
}
