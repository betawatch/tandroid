package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ki0 extends g.o {
    public final /* synthetic */ ni0 c;

    public ki0(ni0 ni0Var) {
        this.c = ni0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        ni0 ni0Var = this.c;
        MessageObject messageObject = (MessageObject) ni0Var.N.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = ni0Var.l(messageObject);
        return l4 != null ? l4.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
