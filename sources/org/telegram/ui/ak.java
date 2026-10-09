package org.telegram.ui;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ak extends g.o {
    public final /* synthetic */ zn c;

    public ak(zn znVar) {
        this.c = znVar;
    }

    @Override // g.o
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        zn znVar = this.c;
        mm mmVar = znVar.A0;
        int i12 = mmVar.J;
        return (i10 < i12 || i10 >= mmVar.K || (i11 = i10 - i12) < 0 || i11 >= mmVar.L().size() || (c92 = znVar.c9((messageObject = (MessageObject) znVar.A0.L().get(i11)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : c92.getPosition(messageObject).spanSize;
    }
}
