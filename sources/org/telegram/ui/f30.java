package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class f30 implements Runnable {
    public final /* synthetic */ x50 a;

    public f30(x50 x50Var) {
        this.a = x50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x50 x50Var = this.a;
        org.telegram.ui.ActionBar.b6 b6Var = x50Var.U;
        c50 c50Var = x50Var.V;
        if (c50Var == null || x50Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = x50Var.a1;
        int i10 = call != null ? call.call.schedule_date : x50Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - x50Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            c50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            c50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && b6Var.getTag() == null) {
                b6Var.setTag(1);
                b6Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        x50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(x50Var.w2, 1000L);
    }
}
