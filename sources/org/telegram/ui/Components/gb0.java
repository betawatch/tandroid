package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gb0 extends f2.v {
    public final /* synthetic */ sb0 c;

    public gb0(sb0 sb0Var) {
        this.c = sb0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        sb0 sb0Var = this.c;
        return (i10 >= sb0Var.r.previewMessages.size() || (a2 = sb0.a(sb0Var, (messageObject = sb0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
