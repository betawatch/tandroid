package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class fk implements Runnable {
    public final /* synthetic */ bo a;

    public fk(bo boVar) {
        this.a = boVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bo boVar = this.a;
        MessageObject messageObject = boVar.d5;
        if (messageObject == null || boVar.T8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (boVar.getConnectionsManager().getCurrentTime() - boVar.d5.messageOwner.date));
        boVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(boVar.U8, 1000L);
    }
}
