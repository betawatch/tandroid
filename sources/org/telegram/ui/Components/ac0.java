package org.telegram.ui.Components;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ac0 extends g.o {
    public final /* synthetic */ lc0 c;

    public ac0(lc0 lc0Var) {
        this.c = lc0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        MessageObject messageObject;
        MessageObject.GroupedMessages a2;
        if (i10 < 0) {
            return MediaDataController.MAX_STYLE_RUNS_COUNT;
        }
        lc0 lc0Var = this.c;
        return (i10 >= lc0Var.r.previewMessages.size() || (a2 = lc0.a(lc0Var, (messageObject = lc0Var.r.previewMessages.get(i10)))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : a2.getPosition(messageObject).spanSize;
    }
}
