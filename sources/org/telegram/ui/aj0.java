package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class aj0 extends g.p {
    public final /* synthetic */ dj0 c;

    public aj0(dj0 dj0Var) {
        this.c = dj0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        dj0 dj0Var = this.c;
        MessageObject messageObject = (MessageObject) dj0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = dj0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
