package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class mj extends f2.x {
    public final /* synthetic */ qn c;

    public mj(qn qnVar) {
        this.c = qnVar;
    }

    @Override // f2.x
    public final int i(int i9) {
        int i10;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        qn qnVar = this.c;
        bm bmVar = qnVar.w0;
        int i11 = bmVar.F;
        return (i9 < i11 || i9 >= bmVar.G || (i10 = i9 - i11) < 0 || i10 >= bmVar.L().size() || (X8 = qnVar.X8((messageObject = (MessageObject) qnVar.w0.L().get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
