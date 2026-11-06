package nh;

import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLRPC;
import v4.d1;
import v4.g0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public abstract class d extends g0 implements GroupCallMessagesController.CallMessageListener {
    public List c;
    public boolean d;
    public int e;
    public TLRPC.InputGroupCall f;

    @Override // v4.g0
    public final int b() {
        List list = this.c;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage) {
        if (this.c == null) {
            this.c = new ArrayList();
        }
        this.c.add(0, groupCallMessage);
        i(0);
    }

    @Override // org.telegram.messenger.voip.GroupCallMessagesController.CallMessageListener
    public final void onPopGroupCallMessage() {
        List list = this.c;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.c.size() - 1;
        this.c.remove(size);
        s(size);
    }

    @Override // v4.g0
    public final void t(d1 d1Var, int i7) {
        b bVar = (b) d1Var;
        List list = this.c;
        if (list == null || list.size() <= i7) {
            return;
        }
        ((c) bVar.a).set((GroupCallMessage) this.c.get(i7));
    }
}
