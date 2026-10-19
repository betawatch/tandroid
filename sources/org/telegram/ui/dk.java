package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class dk implements Runnable {
    public final /* synthetic */ qn a;

    public dk(qn qnVar) {
        this.a = qnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qn qnVar = this.a;
        MessageObject messageObject = qnVar.d5;
        if (messageObject == null || qnVar.T8 == null) {
            return;
        }
        int max = Math.max(0, messageObject.messageOwner.ttl_period - (qnVar.getConnectionsManager().getCurrentTime() - qnVar.d5.messageOwner.date));
        qnVar.T8.setSubtext(LocaleController.formatString(R.string.AutoDeleteIn, max < 86400 ? AndroidUtilities.formatDuration(max, false, true) : LocaleController.formatPluralString("Days", Math.round(max / 86400.0f), new Object[0])));
        AndroidUtilities.runOnUIThread(qnVar.U8, 1000L);
    }
}
