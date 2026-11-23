package fi;

import android.view.View;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class h7 {
    public int a;
    public View b;

    public h7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, e7 e7Var) {
        int i7 = k10.t0;
        this.a = i7;
        this.b = view;
        np u12 = np.u1(i7);
        u12.R1().h0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = np.u1(this.a).l1(j3);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new bg.h0(this, j3, view, e7Var, u12));
    }
}
