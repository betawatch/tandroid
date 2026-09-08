package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
