package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class fk implements Runnable {
    public final /* synthetic */ sn a;

    public fk(sn snVar) {
        this.a = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sn snVar = this.a;
        MessageObject messageObject = snVar.d5;
        if (messageObject == null || snVar.T8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (snVar.getConnectionsManager().getCurrentTime() - snVar.d5.messageOwner.date));
        snVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(snVar.U8, 1000L);
    }
}
