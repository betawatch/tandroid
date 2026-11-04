package ei;

import android.view.View;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class r7 {
    public int a;
    public View b;

    public r7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j10, View view, o7 o7Var) {
        int i3 = h10.t0;
        this.a = i3;
        this.b = view;
        hp s12 = hp.s1(i3);
        s12.P1().h0(j10, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = hp.s1(this.a).j1(j10);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new cg.f0(this, j10, view, o7Var, s12));
    }
}
