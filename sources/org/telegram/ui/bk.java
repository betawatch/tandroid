package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class bk implements Runnable {
    public final /* synthetic */ wn a;

    public bk(wn wnVar) {
        this.a = wnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wn wnVar = this.a;
        MessageObject messageObject = wnVar.d5;
        if (messageObject == null || wnVar.T8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (wnVar.getConnectionsManager().getCurrentTime() - wnVar.d5.messageOwner.date));
        wnVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(wnVar.U8, 1000L);
    }
}
