package ai;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class qc implements Runnable {
    public final /* synthetic */ rc a;

    public qc(rc rcVar) {
        this.a = rcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rc rcVar = this.a;
        int i10 = rcVar.a;
        ArrayList arrayList = rcVar.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            tL_stories_getPeerMaxIDs.id.add(MessagesController.getInstance(i10).getInputPeer(((Long) arrayList2.get(i11)).longValue()));
        }
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_stories_getPeerMaxIDs, new org.telegram.messenger.a(), new m0(1, this, arrayList2));
    }
}
