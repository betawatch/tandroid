package ih;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class v9 {
    public static long g;
    public final v6 a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final g f = new g(this, 22);

    public v9(int i9, long j10, v6 v6Var) {
        this.b = i9;
        this.a = v6Var;
        this.c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.a.y(this.c);
        if (y10 == null || y10.stories == null) {
            return;
        }
        int i9 = 0;
        while (i9 < y10.stories.size()) {
            i9 = j3.r0.e(y10.stories.get(i9).id, i9, 1, arrayList);
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
            AndroidUtilities.cancelRunOnUIThread(this.f);
            ConnectionsManager.getInstance(this.b).cancelRequest(this.d, false);
            this.d = 0;
        }
    }

    public final void c() {
        if (this.e) {
            long currentTimeMillis = 10000 - (System.currentTimeMillis() - g);
            if (currentTimeMillis > 0) {
                g gVar = this.f;
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar, currentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.id);
                if (!tL_stories_getStoriesViews.id.isEmpty()) {
                    int i9 = this.b;
                    tL_stories_getStoriesViews.peer = MessagesController.getInstance(i9).getInputPeer(this.c);
                    this.d = ConnectionsManager.getInstance(i9).sendRequest(tL_stories_getStoriesViews, new bg.j0(14, this, tL_stories_getStoriesViews));
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
            v6 v6Var = this.a;
            TL_stories.PeerStories y10 = v6Var.y(j10);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i9 = 0; i9 < tL_stories_storyViews.views.size(); i9++) {
                    for (int i10 = 0; i10 < y10.stories.size(); i10++) {
                        if (y10.stories.get(i10).id == ((Integer) arrayList.get(i9)).intValue()) {
                            y10.stories.get(i10).views = tL_stories_storyViews.views.get(i9);
                        }
                    }
                }
                i7 i7Var = v6Var.k;
                i7Var.b.getStorageQueue().postRunnable(new f7(i7Var, y10, 1));
                return true;
            }
        }
        return false;
    }
}
