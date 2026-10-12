package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ej0 extends g.o {
    public final /* synthetic */ hj0 c;

    public ej0(hj0 hj0Var) {
        this.c = hj0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        hj0 hj0Var = this.c;
        MessageObject messageObject = (MessageObject) hj0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = hj0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
