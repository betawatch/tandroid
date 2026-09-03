package eg;

import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import qh.n4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class w1 extends f2.v {
    public final /* synthetic */ n4 c;

    public w1(n4 n4Var) {
        this.c = n4Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        int size = (r0.p0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = this.c.q0;
        return (groupedMessages == null || size < 0 || size >= groupedMessages.messages.size() || (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : position.spanSize;
    }
}
