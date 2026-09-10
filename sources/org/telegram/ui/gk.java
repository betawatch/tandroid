package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class gk implements Runnable {
    public final /* synthetic */ eo a;

    public gk(eo eoVar) {
        this.a = eoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eo eoVar = this.a;
        MessageObject messageObject = eoVar.d5;
        if (messageObject == null || eoVar.T8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (eoVar.getConnectionsManager().getCurrentTime() - eoVar.d5.messageOwner.date));
        eoVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(eoVar.U8, 1000L);
    }
}
