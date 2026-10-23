package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class ji0 extends g.o {
    public final /* synthetic */ mi0 c;

    public ji0(mi0 mi0Var) {
        this.c = mi0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        mi0 mi0Var = this.c;
        MessageObject messageObject = (MessageObject) mi0Var.M.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages k10 = mi0Var.k(messageObject);
        return k10 != null ? k10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
