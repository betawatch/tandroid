package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
