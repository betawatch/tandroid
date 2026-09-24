package ai;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l9 b;

    public /* synthetic */ z7(l9 l9Var, int i10) {
        this.a = i10;
        this.b = l9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                d9 d9Var = (d9) obj;
                l9 l9Var = this.b;
                HashMap hashMap = l9Var.H;
                int i10 = d9Var.e;
                int i11 = d9Var.f;
                long j3 = d9Var.d;
                if (i10 == 0 && i11 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j3));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i11));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j3));
                            break;
                        }
                    }
                } else {
                    HashMap hashMap3 = l9Var.G[i10];
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
                l9 l9Var2 = this.b;
                l9Var2.n = false;
                if (tL_stories_allStories == null) {
                    l9Var2.q();
                    l9Var2.T();
                    break;
                } else {
                    l9Var2.Y(tL_stories_allStories, false, true, false);
                    l9Var2.Q(false);
                    l9Var2.Q(true);
                    break;
                }
        }
    }
}
