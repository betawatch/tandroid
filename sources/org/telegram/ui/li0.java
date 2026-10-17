package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class li0 extends g.o {
    public final /* synthetic */ oi0 c;

    public li0(oi0 oi0Var) {
        this.c = oi0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        oi0 oi0Var = this.c;
        MessageObject messageObject = (MessageObject) oi0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = oi0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
