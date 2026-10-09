package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p30 implements Runnable {
    public final /* synthetic */ g60 a;

    public p30(g60 g60Var) {
        this.a = g60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g60 g60Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var = g60Var.U;
        l50 l50Var = g60Var.V;
        if (l50Var == null || g60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = g60Var.a1;
        int i10 = call != null ? call.call.schedule_date : g60Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - g60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            l50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            l50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && j5Var.getTag() == null) {
                j5Var.setTag(1);
                j5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        g60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(g60Var.w2, 1000L);
    }
}
