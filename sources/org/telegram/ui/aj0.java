package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class aj0 extends g.o {
    public final /* synthetic */ dj0 c;

    public aj0(dj0 dj0Var) {
        this.c = dj0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        dj0 dj0Var = this.c;
        MessageObject messageObject = (MessageObject) dj0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = dj0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
