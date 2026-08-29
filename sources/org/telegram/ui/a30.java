package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a30 implements Runnable {
    public final /* synthetic */ r50 a;

    public a30(r50 r50Var) {
        this.a = r50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r50 r50Var = this.a;
        org.telegram.ui.ActionBar.h5 h5Var = r50Var.Q;
        w40 w40Var = r50Var.R;
        if (w40Var == null || r50Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = r50Var.W0;
        int i10 = call != null ? call.call.schedule_date : r50Var.g2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - r50Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            w40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            w40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && h5Var.getTag() == null) {
                h5Var.setTag(1);
                h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        r50Var.S.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(r50Var.s2, 1000L);
    }
}
