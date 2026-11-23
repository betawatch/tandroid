package fi;

import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final class m9 implements Runnable {
    public final /* synthetic */ n9 a;

    public m9(n9 n9Var) {
        this.a = n9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n9 n9Var = this.a;
        int i7 = n9Var.a;
        ArrayList arrayList = n9Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            tL_stories_getPeerMaxIDs.id.add(np.u1(i7).l1(((Long) arrayList2.get(i10)).longValue()));
        }
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_stories_getPeerMaxIDs, new d3.b(1), new bi.o6(8, this, arrayList2));
    }
}
