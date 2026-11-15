package fi;

import android.view.View;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k7 {
    public int a;
    public View b;

    public k7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, h7 h7Var) {
        int i7 = m10.t0;
        this.a = i7;
        this.b = view;
        np s12 = np.s1(i7);
        s12.P1().h0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = np.s1(this.a).j1(j3);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new bg.g0(this, j3, view, h7Var, s12));
    }
}
