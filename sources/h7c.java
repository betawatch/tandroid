// default package

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class h7c implements Runnable {
    public final /* synthetic */ i7c a;

    public h7c(i7c i7cVar) {
        this.a = i7cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i7c i7cVar = this.a;
        int i = i7cVar.a;
        ArrayList arrayList = i7cVar.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            tL_stories_getPeerMaxIDs.id.add(na7.q1(i).h1(((Long) arrayList2.get(i2)).longValue()));
        }
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_stories_getPeerMaxIDs, new hc((byte) 0), new w77(this, arrayList2, (byte) 17));
    }
}
