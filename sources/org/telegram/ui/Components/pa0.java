package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class pa0 extends f2.w {
    public final /* synthetic */ ab0 c;

    public pa0(ab0 ab0Var) {
        this.c = ab0Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        ab0 ab0Var = this.c;
        return (i10 >= ab0Var.r.previewMessages.size() || (a2 = ab0.a(ab0Var, (messageObject = ab0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
