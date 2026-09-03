package dg;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import ph.o4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
