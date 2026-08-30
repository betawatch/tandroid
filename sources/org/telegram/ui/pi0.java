package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class pi0 extends f2.v {
    public final /* synthetic */ si0 c;

    public pi0(si0 si0Var) {
        this.c = si0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        si0 si0Var = this.c;
        MessageObject messageObject = (MessageObject) si0Var.K.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l10 = si0Var.l(messageObject);
        return l10 != null ? l10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
