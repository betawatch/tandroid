package di;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z5 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ z5(z6 z6Var, int i7) {
        this.a = i7;
        this.b = z6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                r6 r6Var = (r6) obj;
                z6 z6Var = this.b;
                HashMap hashMap = z6Var.H;
                int i7 = r6Var.e;
                int i10 = r6Var.f;
                long j3 = r6Var.d;
                if (i7 == 0 && i10 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j3));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i10));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j3));
                            break;
                        }
                    }
                } else {
                    HashMap hashMap3 = z6Var.G[i7];
                    if (hashMap3 != null) {
                        hashMap3.remove(Long.valueOf(j3));
                        break;
                    }
                }
                break;
            case 1:
                this.b.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                z6 z6Var2 = this.b;
                z6Var2.n = false;
                if (tL_stories_allStories == null) {
                    z6Var2.q();
                    z6Var2.W();
                    break;
                } else {
                    z6Var2.b0(tL_stories_allStories, false, true, false);
                    z6Var2.T(false);
                    z6Var2.T(true);
                    break;
                }
        }
    }
}
