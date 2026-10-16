package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class dc0 extends g.o {
    public final /* synthetic */ pc0 c;

    public dc0(pc0 pc0Var) {
        this.c = pc0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        pc0 pc0Var = this.c;
        return (i10 >= pc0Var.r.previewMessages.size() || (a2 = pc0.a(pc0Var, (messageObject = pc0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
