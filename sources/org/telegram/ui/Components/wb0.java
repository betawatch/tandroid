package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class wb0 extends g.o {
    public final /* synthetic */ hc0 c;

    public wb0(hc0 hc0Var) {
        this.c = hc0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        hc0 hc0Var = this.c;
        return (i10 >= hc0Var.r.previewMessages.size() || (a2 = hc0.a(hc0Var, (messageObject = hc0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
