package fi;

import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public class o9 {
    public static long g;
    public final p6 a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final f2.a f = new f2.a(this, 24);

    public o9(int i7, long j3, p6 p6Var) {
        this.b = i7;
        this.a = p6Var;
        this.c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.a.y(this.c);
        if (y10 == null || y10.stories == null) {
            return;
        }
        int i7 = 0;
        while (i7 < y10.stories.size()) {
            i7 = com.google.android.gms.internal.vision.e2.f(y10.stories.get(i7).id, i7, 1, arrayList);
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
                f2.a aVar = this.f;
                org.telegram.messenger.g0.r(aVar);
                org.telegram.messenger.g0.h3(aVar, currentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.id);
                if (!tL_stories_getStoriesViews.id.isEmpty()) {
                    int i7 = this.b;
                    tL_stories_getStoriesViews.peer = mp.u1(i7).l1(this.c);
                    this.d = ConnectionsManager.getInstance(i7).sendRequest(tL_stories_getStoriesViews, new bi.k1(14, this, tL_stories_getStoriesViews));
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
            p6 p6Var = this.a;
            TL_stories.PeerStories y10 = p6Var.y(j3);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i7 = 0; i7 < tL_stories_storyViews.views.size(); i7++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).id == ((Integer) arrayList.get(i7)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i7);
                        }
                    }
                }
                c7 c7Var = p6Var.k;
                c7Var.b.a.c(new a7(c7Var, y10, 0));
                return true;
            }
        }
        return false;
    }
}
