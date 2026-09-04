package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
