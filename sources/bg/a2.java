package bg;

import nh.f5;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a2 extends f2.v {
    public final /* synthetic */ f5 c;

    public a2(f5 f5Var) {
        this.c = f5Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        int size = (r0.o0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = this.c.p0;
        return (groupedMessages == null || size < 0 || size >= groupedMessages.messages.size() || (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) == null) ? MediaDataController.MAX_STYLE_RUNS_COUNT : position.spanSize;
    }
}
