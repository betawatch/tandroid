package bi;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class wb implements Runnable {
    public final /* synthetic */ xb a;

    public wb(xb xbVar) {
        this.a = xbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xb xbVar = this.a;
        int i10 = xbVar.a;
        ArrayList arrayList = xbVar.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            tL_stories_getPeerMaxIDs.id.add(MessagesController.getInstance(i10).getInputPeer(((Long) arrayList2.get(i11)).longValue()));
        }
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_stories_getPeerMaxIDs, new org.telegram.messenger.a(), new f0(1, this, arrayList2));
    }
}
