package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class m30 implements Runnable {
    public final /* synthetic */ d60 a;

    public m30(d60 d60Var) {
        this.a = d60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d60 d60Var = this.a;
        org.telegram.ui.ActionBar.h5 h5Var = d60Var.U;
        i50 i50Var = d60Var.V;
        if (i50Var == null || d60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = d60Var.a1;
        int i10 = call != null ? call.call.schedule_date : d60Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - d60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            i50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            i50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && h5Var.getTag() == null) {
                h5Var.setTag(1);
                h5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        d60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(d60Var.w2, 1000L);
    }
}
