// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
