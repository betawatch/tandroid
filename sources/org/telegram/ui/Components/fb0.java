package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class fb0 extends f2.v {
    public final /* synthetic */ rb0 c;

    public fb0(rb0 rb0Var) {
        this.c = rb0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        rb0 rb0Var = this.c;
        return (i10 >= rb0Var.r.previewMessages.size() || (a2 = rb0.a(rb0Var, (messageObject = rb0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
