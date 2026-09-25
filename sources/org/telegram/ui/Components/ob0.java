package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ob0 extends g.p {
    public final /* synthetic */ zb0 c;

    public ob0(zb0 zb0Var) {
        this.c = zb0Var;
    }

    @Override // g.p
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        zb0 zb0Var = this.c;
        return (i10 >= zb0Var.r.previewMessages.size() || (a2 = zb0.a(zb0Var, (messageObject = zb0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
