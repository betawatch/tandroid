package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class aj0 extends g.p {
    public final /* synthetic */ dj0 c;

    public aj0(dj0 dj0Var) {
        this.c = dj0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        dj0 dj0Var = this.c;
        MessageObject messageObject = (MessageObject) dj0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = dj0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
