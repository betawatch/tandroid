package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ki0 extends g.o {
    public final /* synthetic */ ni0 c;

    public ki0(ni0 ni0Var) {
        this.c = ni0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        ni0 ni0Var = this.c;
        MessageObject messageObject = (MessageObject) ni0Var.M.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages k10 = ni0Var.k(messageObject);
        return k10 != null ? k10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
