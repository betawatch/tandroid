package di;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x9 implements Runnable {
    public final /* synthetic */ y9 a;

    public x9(y9 y9Var) {
        this.a = y9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y9 y9Var = this.a;
        int i7 = y9Var.a;
        ArrayList arrayList = y9Var.d;
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
