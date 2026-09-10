package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ak extends g.p {
    public final /* synthetic */ eo c;

    public ak(eo eoVar) {
        this.c = eoVar;
    }

    @Override // g.p
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        eo eoVar = this.c;
        pm pmVar = eoVar.A0;
        int i12 = pmVar.J;
        return (i10 < i12 || i10 >= pmVar.K || (i11 = i10 - i12) < 0 || i11 >= pmVar.L().size() || (X8 = eoVar.X8((messageObject = (MessageObject) eoVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : X8.getPosition(messageObject).spanSize;
    }
}
