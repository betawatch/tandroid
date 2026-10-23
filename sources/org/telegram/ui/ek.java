package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
