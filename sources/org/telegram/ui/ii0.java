package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ii0 extends f2.x {
    public final /* synthetic */ li0 c;

    public ii0(li0 li0Var) {
        this.c = li0Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        li0 li0Var = this.c;
        MessageObject messageObject = (MessageObject) li0Var.J.get((r1.size() - 1) - i9);
        MessageObject.GroupedMessages l10 = li0Var.l(messageObject);
        return l10 != null ? l10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
