package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class eb0 extends f2.v {
    public final /* synthetic */ qb0 c;

    public eb0(qb0 qb0Var) {
        this.c = qb0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        qb0 qb0Var = this.c;
        return (i10 >= qb0Var.r.previewMessages.size() || (a2 = qb0.a(qb0Var, (messageObject = qb0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
