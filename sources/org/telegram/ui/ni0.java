package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class ni0 extends g.o {
    public final /* synthetic */ qi0 c;

    public ni0(qi0 qi0Var) {
        this.c = qi0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        qi0 qi0Var = this.c;
        MessageObject messageObject = (MessageObject) qi0Var.M.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages k10 = qi0Var.k(messageObject);
        return k10 != null ? k10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
