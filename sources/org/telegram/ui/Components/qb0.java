package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class qb0 extends g.p {
    public final /* synthetic */ cc0 c;

    public qb0(cc0 cc0Var) {
        this.c = cc0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        cc0 cc0Var = this.c;
        return (i10 >= cc0Var.r.previewMessages.size() || (a2 = cc0.a(cc0Var, (messageObject = cc0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
