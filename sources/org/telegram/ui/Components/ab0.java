package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ab0 extends f2.v {
    public final /* synthetic */ lb0 c;

    public ab0(lb0 lb0Var) {
        this.c = lb0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        lb0 lb0Var = this.c;
        return (i10 >= lb0Var.r.previewMessages.size() || (a2 = lb0.a(lb0Var, (messageObject = lb0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
