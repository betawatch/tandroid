package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ki0 extends f2.w {
    public final /* synthetic */ ni0 c;

    public ki0(ni0 ni0Var) {
        this.c = ni0Var;
    }

    @Override // f2.w
    public final int i(int i10) {
        ni0 ni0Var = this.c;
        MessageObject messageObject = (MessageObject) ni0Var.J.get((r1.size() - 1) - i10);
        MessageObject.GroupedMessages l10 = ni0Var.l(messageObject);
        return l10 != null ? l10.getPosition(messageObject).spanSize : MediaDataController.MAX_STYLE_RUNS_COUNT;
    }
}
