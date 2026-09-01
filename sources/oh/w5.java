package oh;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
