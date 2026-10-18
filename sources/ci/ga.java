package ci;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class ga implements Runnable {
    public final /* synthetic */ ha a;

    public ga(ha haVar) {
        this.a = haVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ha haVar = this.a;
        int i10 = haVar.a;
        ArrayList arrayList = haVar.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            tL_stories_getPeerMaxIDs.id.add(MessagesController.getInstance(i10).getInputPeer(((Long) arrayList2.get(i11)).longValue()));
        }
        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_stories_getPeerMaxIDs, new org.telegram.messenger.a(), new ai.q5(5, this, arrayList2));
    }
}
