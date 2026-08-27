package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class oj extends f2.w {
    public final /* synthetic */ rn c;

    public oj(rn rnVar) {
        this.c = rnVar;
    }

    @Override // f2.w
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        rn rnVar = this.c;
        dm dmVar = rnVar.w0;
        int i12 = dmVar.F;
        return (i10 < i12 || i10 >= dmVar.G || (i11 = i10 - i12) < 0 || i11 >= dmVar.L().size() || (X8 = rnVar.X8((messageObject = (MessageObject) rnVar.w0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
