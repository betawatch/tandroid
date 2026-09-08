package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class eb0 extends g.p {
    public final /* synthetic */ qb0 c;

    public eb0(qb0 qb0Var) {
        this.c = qb0Var;
    }

    @Override // g.p
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
