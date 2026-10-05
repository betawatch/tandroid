package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class bk implements Runnable {
    public final /* synthetic */ yn a;

    public bk(yn ynVar) {
        this.a = ynVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yn ynVar = this.a;
        MessageObject messageObject = ynVar.b5;
        if (messageObject == null || ynVar.R8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (ynVar.getConnectionsManager().getCurrentTime() - ynVar.b5.messageOwner.date));
        ynVar.R8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(ynVar.S8, 1000L);
    }
}
