package dg;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import ph.o4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y1 extends f2.v {
    public final /* synthetic */ o4 c;

    public y1(o4 o4Var) {
        this.c = o4Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        int size = (r0.p0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = this.c.q0;
        return (groupedMessages == null || size < 0 || size >= groupedMessages.messages.size() || (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : position.spanSize;
    }
}
