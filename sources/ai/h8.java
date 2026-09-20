package ai;

import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class h8 implements e2.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ h8(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // e2.h
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                l9 l9Var = this.b;
                l9Var.n = false;
                if (tL_stories_allStories == null) {
                    l9Var.q();
                    l9Var.T();
                    break;
                } else {
                    l9Var.Y(tL_stories_allStories, false, true, false);
                    l9Var.Q(false);
                    l9Var.Q(true);
                    break;
                }
        }
    }
}
