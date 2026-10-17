package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class a30 implements Runnable {
    public final /* synthetic */ s50 a;

    public a30(s50 s50Var) {
        this.a = s50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s50 s50Var = this.a;
        org.telegram.ui.ActionBar.j5 j5Var = s50Var.U;
        x40 x40Var = s50Var.V;
        if (x40Var == null || s50Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = s50Var.a1;
        int i10 = call != null ? call.call.schedule_date : s50Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - s50Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            x40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            x40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && j5Var.getTag() == null) {
                j5Var.setTag(1);
                j5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        s50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(s50Var.w2, 1000L);
    }
}
