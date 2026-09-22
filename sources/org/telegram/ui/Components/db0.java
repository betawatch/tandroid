package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
