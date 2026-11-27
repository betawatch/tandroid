// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hbc implements Runnable {
    public final /* synthetic */ ibc a;

    public hbc(ibc ibcVar) {
        this.a = ibcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ibc ibcVar = this.a;
        int i = ibcVar.a;
        ArrayList arrayList = ibcVar.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            tL_stories_getPeerMaxIDs.id.add(uc7.s1(i).j1(((Long) arrayList2.get(i2)).longValue()));
        }
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_stories_getPeerMaxIDs, new ic((byte) 0), new ia7(this, arrayList2, (byte) 17));
    }
}
