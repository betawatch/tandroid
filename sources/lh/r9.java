package lh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public class r9 {
    public static long g;
    public final s6 a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final m5 f = new m5(this, 13);

    public r9(int i10, long j10, s6 s6Var) {
        this.b = i10;
        this.a = s6Var;
        this.c = j10;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y8 = this.a.y(this.c);
        if (y8 == null || y8.stories == null) {
            return;
        }
        int i10 = 0;
        while (i10 < y8.stories.size()) {
            i10 = th.d(y8.stories.get(i10).id, i10, 1, arrayList);
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
                m5 m5Var = this.f;
                AndroidUtilities.cancelRunOnUIThread(m5Var);
                AndroidUtilities.runOnUIThread(m5Var, currentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.id);
                if (!tL_stories_getStoriesViews.id.isEmpty()) {
                    int i10 = this.b;
                    tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.c);
                    this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new bg.h3(15, this, tL_stories_getStoriesViews));
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
            s6 s6Var = this.a;
            TL_stories.PeerStories y8 = s6Var.y(j10);
            if (y8 != null && !y8.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y8.stories.size(); i11++) {
                        if (y8.stories.get(i11).id == ((Integer) arrayList.get(i10)).intValue()) {
                            y8.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                f7 f7Var = s6Var.k;
                f7Var.b.getStorageQueue().postRunnable(new c7(f7Var, y8, 1));
                return true;
            }
        }
        return false;
    }
}
