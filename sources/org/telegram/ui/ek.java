package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ek implements Runnable {
    public final /* synthetic */ zn a;

    public ek(zn znVar) {
        this.a = znVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zn znVar = this.a;
        MessageObject messageObject = znVar.d5;
        if (messageObject == null || znVar.T8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (znVar.getConnectionsManager().getCurrentTime() - znVar.d5.messageOwner.date));
        znVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(znVar.U8, 1000L);
    }
}
