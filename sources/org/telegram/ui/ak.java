package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ak implements Runnable {
    public final /* synthetic */ xn a;

    public ak(xn xnVar) {
        this.a = xnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xn xnVar = this.a;
        MessageObject messageObject = xnVar.a5;
        if (messageObject == null || xnVar.Q8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (xnVar.getConnectionsManager().getCurrentTime() - xnVar.a5.messageOwner.date));
        xnVar.Q8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(xnVar.R8, 1000L);
    }
}
