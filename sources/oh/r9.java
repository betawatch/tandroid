package oh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public class r9 {
    public static long g;
    public final t6 a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final t3 f = new t3(this, 16);

    public r9(int i10, long j10, t6 t6Var) {
        this.b = i10;
        this.a = t6Var;
        this.c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y10 = this.a.y(this.c);
        if (y10 == null || y10.stories == null) {
            return;
        }
        int i10 = 0;
        while (i10 < y10.stories.size()) {
            i10 = yh.d(y10.stories.get(i10).id, i10, 1, arrayList);
        }
    }

    public final void b(boolean z4) {
        if (this.e == z4) {
            return;
        }
        if (z4) {
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
                t3 t3Var = this.f;
                AndroidUtilities.cancelRunOnUIThread(t3Var);
                AndroidUtilities.runOnUIThread(t3Var, currentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.id);
                if (!tL_stories_getStoriesViews.id.isEmpty()) {
                    int i10 = this.b;
                    tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.c);
                    this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new eg.b3(15, this, tL_stories_getStoriesViews));
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
            t6 t6Var = this.a;
            TL_stories.PeerStories y10 = t6Var.y(j10);
            if (y10 != null && !y10.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y10.stories.size(); i11++) {
                        if (y10.stories.get(i11).id == ((Integer) arrayList.get(i10)).intValue()) {
                            y10.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                g7 g7Var = t6Var.k;
                g7Var.b.getStorageQueue().postRunnable(new d7(g7Var, y10, 1));
                return true;
            }
        }
        return false;
    }
}
