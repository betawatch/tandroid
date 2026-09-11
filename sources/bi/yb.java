package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public class yb {
    public static long g;
    public final u8 a;
    public final int b;
    public final long c;
    public int d;
    public boolean e;
    public final oa f = new oa(this, 4);

    public yb(int i10, long j3, u8 u8Var) {
        this.b = i10;
        this.a = u8Var;
        this.c = j3;
    }

    public void a(ArrayList arrayList) {
        TL_stories.PeerStories y3 = this.a.y(this.c);
        if (y3 == null || y3.stories == null) {
            return;
        }
        int i10 = 0;
        while (i10 < y3.stories.size()) {
            i10 = com.google.android.gms.internal.vision.e2.e(y3.stories.get(i10).id, i10, 1, arrayList);
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
                oa oaVar = this.f;
                AndroidUtilities.cancelRunOnUIThread(oaVar);
                AndroidUtilities.runOnUIThread(oaVar, currentTimeMillis);
                return;
            }
            if (this.d == 0) {
                TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
                a(tL_stories_getStoriesViews.id);
                if (!tL_stories_getStoriesViews.id.isEmpty()) {
                    int i10 = this.b;
                    tL_stories_getStoriesViews.peer = MessagesController.getInstance(i10).getInputPeer(this.c);
                    this.d = ConnectionsManager.getInstance(i10).sendRequest(tL_stories_getStoriesViews, new m1(4, this, tL_stories_getStoriesViews));
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
            u8 u8Var = this.a;
            TL_stories.PeerStories y3 = u8Var.y(j3);
            if (y3 != null && !y3.stories.isEmpty()) {
                for (int i10 = 0; i10 < tL_stories_storyViews.views.size(); i10++) {
                    for (int i11 = 0; i11 < y3.stories.size(); i11++) {
                        if (y3.stories.get(i11).id == ((Integer) arrayList.get(i10)).intValue()) {
                            y3.stories.get(i11).views = tL_stories_storyViews.views.get(i10);
                        }
                    }
                }
                h9 h9Var = u8Var.k;
                h9Var.b.getStorageQueue().postRunnable(new e9(h9Var, y3, 1));
                return true;
            }
        }
        return false;
    }
}
