package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ji0 extends g.o {
    public final /* synthetic */ mi0 c;

    public ji0(mi0 mi0Var) {
        this.c = mi0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        mi0 mi0Var = this.c;
        MessageObject messageObject = (MessageObject) mi0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = mi0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
