package di;

import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public class z9 {
    public static long g;
    public final z6 a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final f8 f = new f8(this, 6);

    public z9(int i7, long j3, z6 z6Var) {
        this.b = i7;
        this.a = z6Var;
        this.c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.a.y(this.c);
        if (y10 == null || y10.stories == null) {
            return;
        }
        int i7 = 0;
        while (i7 < y10.stories.size()) {
            i7 = com.google.android.recaptcha.internal.a.f(y10.stories.get(i7).id, i7, 1, arrayList);
        }
    }

    public final void b(boolean z9) {
        if (this.e == z9) {
            return;
        }
        if (z9) {
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
                f8 f8Var = this.f;
                org.telegram.messenger.g0.r(f8Var);
                org.telegram.messenger.g0.i3(f8Var, currentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.id);
                if (!tL_stories_getStoriesViews.id.isEmpty()) {
                    int i7 = this.b;
                    tL_stories_getStoriesViews.peer = qp.s1(i7).j1(this.c);
                    this.d = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoriesViews, new bi.j(11, this, tL_stories_getStoriesViews));
                    return;
                }
            }
            this.d = 0;
            this.e = false;
        }
    }

    public boolean d(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            long j3 = this.c;
            z6 z6Var = this.a;
            TL_stories.PeerStories y10 = z6Var.y(j3);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i7 = 0; i7 < tL_stories_storyViews.views.size(); i7++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).id == ((Integer) arrayList.get(i7)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i7);
                        }
                    }
                }
                m7 m7Var = z6Var.k;
                m7Var.b.a.c(new k7(m7Var, y10, 0));
                return true;
            }
        }
        return false;
    }
}
