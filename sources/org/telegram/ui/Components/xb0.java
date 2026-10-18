package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
