package lh;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements f5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ v5(s6 s6Var, int i10) {
        this.a = i10;
        this.b = s6Var;
    }

    @Override // f5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                s6 s6Var = this.b;
                s6Var.n = false;
                if (tL_stories_allStories == null) {
                    s6Var.q();
                    s6Var.T();
                    break;
                } else {
                    s6Var.Y(tL_stories_allStories, false, true, false);
                    s6Var.Q(false);
                    s6Var.Q(true);
                    break;
                }
        }
    }
}
