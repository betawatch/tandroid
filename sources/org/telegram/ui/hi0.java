package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class hi0 extends f2.v {
    public final /* synthetic */ ki0 c;

    public hi0(ki0 ki0Var) {
        this.c = ki0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        ki0 ki0Var = this.c;
        MessageObject messageObject = (MessageObject) ki0Var.J.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l10 = ki0Var.l(messageObject);
        return l10 != null ? l10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
