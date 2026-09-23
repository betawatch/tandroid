package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class o30 implements Runnable {
    public final /* synthetic */ f60 a;

    public o30(f60 f60Var) {
        this.a = f60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f60 f60Var = this.a;
        org.telegram.ui.ActionBar.i5 i5Var = f60Var.U;
        k50 k50Var = f60Var.V;
        if (k50Var == null || f60Var.isDismissed()) {
            return;
        }
        ChatObject.Call call = f60Var.a1;
        int i10 = call != null ? call.call.schedule_date : f60Var.k2;
        if (i10 == 0) {
            return;
        }
        int currentTime = i10 - f60Var.d.getConnectionsManager().getCurrentTime();
        if (currentTime >= 86400) {
            k50Var.l(LocaleController.formatPluralString("Days", Math.round(currentTime / 86400.0f), new Object[0]), false);
        } else {
            k50Var.l(AndroidUtilities.formatFullDuration(Math.abs(currentTime)), false);
            if (currentTime < 0 && i5Var.getTag() == null) {
                i5Var.setTag(1);
                i5Var.l(LocaleController.getString(R.string.VoipChatLateBy), false);
            }
        }
        f60Var.W.l(LocaleController.formatStartsTime(i10, 3), false);
        AndroidUtilities.runOnUIThread(f60Var.w2, 1000L);
    }
}
