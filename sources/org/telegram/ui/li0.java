package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
