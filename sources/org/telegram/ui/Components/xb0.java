package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class xb0 extends g.o {
    public final /* synthetic */ ic0 c;

    public xb0(ic0 ic0Var) {
        this.c = ic0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        ic0 ic0Var = this.c;
        return (i10 >= ic0Var.r.previewMessages.size() || (a2 = ic0.a(ic0Var, (messageObject = ic0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
