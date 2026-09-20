package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class dk implements Runnable {
    public final /* synthetic */ zn a;

    public dk(zn znVar) {
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
