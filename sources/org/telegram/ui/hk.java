package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class hk implements Runnable {
    public final /* synthetic */ wn a;

    public hk(wn wnVar) {
        this.a = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wn wnVar = this.a;
        MessageObject messageObject = wnVar.t5;
        if (messageObject == null || wnVar.j9 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (wnVar.getConnectionsManager().getCurrentTime() - wnVar.t5.messageOwner.date));
        wnVar.j9.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(wnVar.k9, 1000L);
    }
}
