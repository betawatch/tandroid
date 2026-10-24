package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ek implements Runnable {
    public final /* synthetic */ sn a;

    public ek(sn snVar) {
        this.a = snVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sn snVar = this.a;
        MessageObject messageObject = snVar.p5;
        if (messageObject == null || snVar.f9 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (snVar.getConnectionsManager().getCurrentTime() - snVar.p5.messageOwner.date));
        snVar.f9.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(snVar.g9, 1000L);
    }
}
