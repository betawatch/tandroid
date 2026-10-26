package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class fk implements Runnable {
    public final /* synthetic */ un a;

    public fk(un unVar) {
        this.a = unVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        un unVar = this.a;
        MessageObject messageObject = unVar.p5;
        if (messageObject == null || unVar.f9 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (unVar.getConnectionsManager().getCurrentTime() - unVar.p5.messageOwner.date));
        unVar.f9.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(unVar.g9, 1000L);
    }
}
