package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bk implements Runnable {
    public final /* synthetic */ xn a;

    public bk(xn xnVar) {
        this.a = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xn xnVar = this.a;
        MessageObject messageObject = xnVar.d5;
        if (messageObject == null || xnVar.T8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (xnVar.getConnectionsManager().getCurrentTime() - xnVar.d5.messageOwner.date));
        xnVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(xnVar.U8, 1000L);
    }
}
