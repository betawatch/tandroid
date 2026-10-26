package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class d30 implements Runnable {
    public final /* synthetic */ v50 a;

    public d30(v50 v50Var) {
        this.a = v50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v50 v50Var = this.a;
        org.telegram.ui.ActionBar.b6 b6Var = v50Var.U;
        a50 a50Var = v50Var.V;
        if (a50Var == null || v50Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = v50Var.a1;
        int i10 = call != null ? call.call.schedule_date : v50Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - v50Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            a50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            a50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && b6Var.getTag() == null) {
                b6Var.setTag(1);
                b6Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        v50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(v50Var.w2, 1000L);
    }
}
