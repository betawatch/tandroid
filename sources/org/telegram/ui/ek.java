package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class ek implements Runnable {
    public final /* synthetic */ co a;

    public ek(co coVar) {
        this.a = coVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        co coVar = this.a;
        MessageObject messageObject = coVar.d5;
        if (messageObject == null || coVar.T8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (coVar.getConnectionsManager().getCurrentTime() - coVar.d5.messageOwner.date));
        coVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(coVar.U8, 1000L);
    }
}
