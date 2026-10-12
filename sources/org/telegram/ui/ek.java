package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class ek extends g.o {
    public final /* synthetic */ fo c;

    public ek(fo foVar) {
        this.c = foVar;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        fo foVar = this.c;
        rm rmVar = foVar.A0;
        int i12 = rmVar.J;
        return (i10 < i12 || i10 >= rmVar.K || (i11 = i10 - i12) < 0 || i11 >= rmVar.L().size() || (c92 = foVar.c9((messageObject = (MessageObject) foVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : c92.getPosition(messageObject).spanSize;
    }
}
