package di;

import android.view.View;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class q7 {
    public int a;
    public View b;

    public q7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, n7 n7Var) {
        int i7 = p10.s0;
        this.a = i7;
        this.b = view;
        qp s12 = qp.s1(i7);
        s12.P1().h0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = qp.s1(this.a).j1(j3);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new bg.g0(this, j3, view, n7Var, s12));
    }
}
