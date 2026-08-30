package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m30 implements Runnable {
    public final /* synthetic */ c60 a;

    public m30(c60 c60Var) {
        this.a = c60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c60 c60Var = this.a;
        org.telegram.ui.ActionBar.k5 k5Var = c60Var.R;
        i50 i50Var = c60Var.S;
        if (i50Var == null || c60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = c60Var.X0;
        int i10 = call != null ? call.call.schedule_date : c60Var.h2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - c60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            i50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            i50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && k5Var.getTag() == null) {
                k5Var.setTag(1);
                k5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        c60Var.T.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(c60Var.t2, 1000L);
    }
}
