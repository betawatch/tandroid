package bi;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8 b;

    public /* synthetic */ q7(u8 u8Var, int i10) {
        this.a = i10;
        this.b = u8Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                u8 u8Var = this.b;
                u8Var.n = false;
                if (tL_stories_allStories == null) {
                    u8Var.q();
                    u8Var.T();
                    break;
                } else {
                    u8Var.Y(tL_stories_allStories, false, true, false);
                    u8Var.Q(false);
                    u8Var.Q(true);
                    break;
                }
        }
    }
}
