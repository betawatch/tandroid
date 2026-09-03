package nh;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w5 implements h5.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ t6 b;

    public /* synthetic */ w5(t6 t6Var, int i10) {
        this.a = i10;
        this.b = t6Var;
    }

    @Override // h5.d
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                t6 t6Var = this.b;
                t6Var.n = false;
                if (tL_stories_allStories == null) {
                    t6Var.q();
                    t6Var.T();
                    break;
                } else {
                    t6Var.Y(tL_stories_allStories, false, true, false);
                    t6Var.Q(false);
                    t6Var.Q(true);
                    break;
                }
        }
    }
}
