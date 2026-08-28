package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class la0 extends f2.x {
    public final /* synthetic */ wa0 c;

    public la0(wa0 wa0Var) {
        this.c = wa0Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i9 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        wa0 wa0Var = this.c;
        return (i9 >= wa0Var.r.previewMessages.size() || (a2 = wa0.a(wa0Var, (messageObject = wa0Var.r.previewMessages.get(i9)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
