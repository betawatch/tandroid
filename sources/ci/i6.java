package ci;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;

    public /* synthetic */ i6(i7 i7Var, int i10) {
        this.a = i10;
        this.b = i7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                a7 a7Var = (a7) obj;
                i7 i7Var = this.b;
                HashMap hashMap = i7Var.H;
                int i10 = a7Var.e;
                int i11 = a7Var.f;
                long j10 = a7Var.d;
                if (i10 == 0 && i11 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j10));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i11));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j10));
                            break;
                        }
                    }
                } else {
                    HashMap hashMap3 = i7Var.G[i10];
                    if (hashMap3 != null) {
                        hashMap3.remove(Long.valueOf(j10));
                        break;
                    }
                }
                break;
            case 1:
                this.b.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                i7 i7Var2 = this.b;
                i7Var2.n = false;
                if (tL_stories_allStories == null) {
                    i7Var2.q();
                    i7Var2.T();
                    break;
                } else {
                    i7Var2.Y(tL_stories_allStories, false, true, false);
                    i7Var2.Q(false);
                    i7Var2.Q(true);
                    break;
                }
        }
    }
}
