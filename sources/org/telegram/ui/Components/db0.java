package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class db0 extends g.p {
    public final /* synthetic */ pb0 c;

    public db0(pb0 pb0Var) {
        this.c = pb0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        pb0 pb0Var = this.c;
        return (i10 >= pb0Var.r.previewMessages.size() || (a2 = pb0.a(pb0Var, (messageObject = pb0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
