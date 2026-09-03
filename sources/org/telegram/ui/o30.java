package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o30 implements Runnable {
    public final /* synthetic */ e60 a;

    public o30(e60 e60Var) {
        this.a = e60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e60 e60Var = this.a;
        org.telegram.ui.ActionBar.k5 k5Var = e60Var.R;
        k50 k50Var = e60Var.S;
        if (k50Var == null || e60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = e60Var.X0;
        int i10 = call != null ? call.call.schedule_date : e60Var.h2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - e60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            k50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            k50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && k5Var.getTag() == null) {
                k5Var.setTag(1);
                k5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        e60Var.T.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(e60Var.t2, 1000L);
    }
}
