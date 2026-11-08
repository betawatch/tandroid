package di;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class w9 implements Runnable {
    public final /* synthetic */ x9 a;

    public w9(x9 x9Var) {
        this.a = x9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x9 x9Var = this.a;
        int i7 = x9Var.a;
        ArrayList arrayList = x9Var.d;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        TL_stories.TL_stories_getPeerMaxIDs tL_stories_getPeerMaxIDs = new TL_stories.TL_stories_getPeerMaxIDs();
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            tL_stories_getPeerMaxIDs.id.add(qp.s1(i7).j1(((Long) arrayList2.get(i10)).longValue()));
        }
        ConnectionsManager.getInstance(i7).sendRequestTyped(tL_stories_getPeerMaxIDs, new d3.b(1), new bi.p5(5, this, arrayList2));
    }
}
