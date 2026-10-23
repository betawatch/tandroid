package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class b30 implements Runnable {
    public final /* synthetic */ u50 a;

    public b30(u50 u50Var) {
        this.a = u50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u50 u50Var = this.a;
        org.telegram.ui.ActionBar.n5 n5Var = u50Var.U;
        y40 y40Var = u50Var.V;
        if (y40Var == null || u50Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = u50Var.a1;
        int i10 = call != null ? call.call.schedule_date : u50Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - u50Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            y40Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            y40Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && n5Var.getTag() == null) {
                n5Var.setTag(1);
                n5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        u50Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(u50Var.w2, 1000L);
    }
}
