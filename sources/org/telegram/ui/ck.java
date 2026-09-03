package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ck implements Runnable {
    public final /* synthetic */ zn a;

    public ck(zn znVar) {
        this.a = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zn znVar = this.a;
        MessageObject messageObject = znVar.a5;
        if (messageObject == null || znVar.Q8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (znVar.getConnectionsManager().getCurrentTime() - znVar.a5.messageOwner.date));
        znVar.Q8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(znVar.R8, 1000L);
    }
}
