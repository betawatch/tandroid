package fi;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
            tL_stories_getPeerMaxIDs.id.add(mp.u1(i7).l1(((Long) arrayList2.get(i10)).longValue()));
        }
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_stories_getPeerMaxIDs, new d3.b(1), new bi.p6(8, this, arrayList2));
    }
}
