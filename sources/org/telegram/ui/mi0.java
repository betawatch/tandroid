package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class mi0 extends g.o {
    public final /* synthetic */ pi0 c;

    public mi0(pi0 pi0Var) {
        this.c = pi0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        pi0 pi0Var = this.c;
        MessageObject messageObject = (MessageObject) pi0Var.M.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages k10 = pi0Var.k(messageObject);
        return k10 != null ? k10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
