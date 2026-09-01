package eg;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import qh.o4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class w1 extends f2.v {
    public final /* synthetic */ o4 c;

    public w1(o4 o4Var) {
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
