package ei;

import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class aa {
    public static long g;
    public final z6 a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final z5 f = new z5(this, 12);

    public aa(int i3, long j10, z6 z6Var) {
        this.b = i3;
        this.a = z6Var;
        this.c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y9 = this.a.y(this.c);
        if (y9 == null || y9.stories == null) {
            return;
        }
        int i3 = 0;
        while (i3 < y9.stories.size()) {
            i3 = com.google.android.recaptcha.internal.a.f(y9.stories.get(i3).id, i3, 1, arrayList);
        }
    }

    public final void b(boolean z10) {
        if (this.e == z10) {
            return;
        }
        if (z10) {
            this.e = true;
            c();
        } else {
            this.e = false;
            org.telegram.messenger.g0.r(this.f);
            ConnectionsManager.getInstance(this.b).cancelRequest(this.d, false);
            this.d = 0;
        }
    }

    public final void c() {
        if (this.e) {
            long currentTimeMillis = 10000 - (System.currentTimeMillis() - g);
            if (currentTimeMillis > 0) {
                z5 z5Var = this.f;
                org.telegram.messenger.g0.r(z5Var);
                org.telegram.messenger.g0.i3(z5Var, currentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.id);
                if (!tL_stories_getStoriesViews.id.isEmpty()) {
                    int i3 = this.b;
                    tL_stories_getStoriesViews.peer = hp.s1(i3).j1(this.c);
                    this.d = ConnectionsManager.getInstance(i3).sendRequest(tL_stories_getStoriesViews, new ai.f3(14, this, tL_stories_getStoriesViews));
                    return;
                }
            }
            this.d = 0;
            this.e = false;
        }
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j10 = this.c;
            z6 z6Var = this.a;
            TL_stories.PeerStories y9 = z6Var.y(j10);
            if (y9 != null && !y9.stories.isEmpty()) {
                for (int i3 = 0; i3 < tL_stories_storyViews.views.size(); i3++) {
                    for (int i10 = 0; i10 < y9.stories.size(); i10++) {
                        if (y9.stories.get(i10).id == ((Integer) arrayList.get(i3)).intValue()) {
                            y9.stories.get(i10).views = tL_stories_storyViews.views.get(i3);
                        }
                    }
                }
                m7 m7Var = z6Var.k;
                m7Var.b.a.c(new k7(m7Var, y9, 0));
                return true;
            }
        }
        return false;
    }
}
