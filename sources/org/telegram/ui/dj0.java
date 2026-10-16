package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dj0 extends g.o {
    public final /* synthetic */ gj0 c;

    public dj0(gj0 gj0Var) {
        this.c = gj0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        gj0 gj0Var = this.c;
        MessageObject messageObject = (MessageObject) gj0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = gj0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
