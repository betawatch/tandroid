package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n30 implements Runnable {
    public final /* synthetic */ d60 a;

    public n30(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d60 d60Var = this.a;
        org.telegram.ui.ActionBar.l5 l5Var = d60Var.R;
        j50 j50Var = d60Var.S;
        if (j50Var == null || d60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = d60Var.X0;
        int i10 = call != null ? call.call.schedule_date : d60Var.h2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - d60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            j50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            j50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && l5Var.getTag() == null) {
                l5Var.setTag(1);
                l5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        d60Var.T.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(d60Var.t2, 1000L);
    }
}
