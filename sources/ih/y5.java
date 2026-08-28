package ih;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y5 implements d5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6 b;

    public /* synthetic */ y5(v6 v6Var, int i9) {
        this.a = i9;
        this.b = v6Var;
    }

    @Override // d5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                v6 v6Var = this.b;
                v6Var.n = false;
                if (tL_stories_allStories == null) {
                    v6Var.q();
                    v6Var.T();
                    break;
                } else {
                    v6Var.Y(tL_stories_allStories, false, true, false);
                    v6Var.Q(false);
                    v6Var.Q(true);
                    break;
                }
        }
    }
}
