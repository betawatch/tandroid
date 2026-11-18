package fi;

import android.view.View;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class h7 {
    public int a;
    public View b;

    public h7() {
        ConnectionsManager.generateClassGuid();
    }

    public final void a(long j3, View view, e7 e7Var) {
        int i7 = j10.t0;
        this.a = i7;
        this.b = view;
        mp u12 = mp.u1(i7);
        u12.R1().h0(j3, true);
        view.invalidate();
        TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
        tL_stories_getPeerStories.peer = mp.u1(this.a).l1(j3);
        ConnectionsManager.getInstance(this.a).sendRequest(tL_stories_getPeerStories, new bg.h0(this, j3, view, e7Var, u12));
    }
}
