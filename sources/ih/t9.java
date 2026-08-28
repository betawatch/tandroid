package ih;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class t9 implements Runnable {
    public final /* synthetic */ u9 a;

    public t9(u9 u9Var) {
        this.a = u9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u9 u9Var = this.a;
        int i9 = u9Var.a;
        ArrayList arrayList = u9Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            tL_stories_getPeerMaxIDs.id.add(MessagesController.getInstance(i9).getInputPeer(((Long) arrayList2.get(i10)).longValue()));
        }
        ConnectionsManager.getInstance(i9).sendRequestTyped(tL_stories_getPeerMaxIDs, new org.telegram.messenger.a(), new bg.y0(7, this, arrayList2));
    }
}
