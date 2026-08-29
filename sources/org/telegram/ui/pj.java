package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pj extends f2.v {
    public final /* synthetic */ tn c;

    public pj(tn tnVar) {
        this.c = tnVar;
    }

    @Override // f2.v
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        tn tnVar = this.c;
        em emVar = tnVar.w0;
        int i12 = emVar.F;
        return (i10 < i12 || i10 >= emVar.G || (i11 = i10 - i12) < 0 || i11 >= emVar.L().size() || (X8 = tnVar.X8((messageObject = (MessageObject) tnVar.w0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
