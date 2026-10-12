package bi;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class l7 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x8 b;

    public /* synthetic */ l7(x8 x8Var, int i10) {
        this.a = i10;
        this.b = x8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                o8 o8Var = (o8) obj;
                x8 x8Var = this.b;
                HashMap hashMap = x8Var.H;
                int i10 = o8Var.e;
                int i11 = o8Var.f;
                long j10 = o8Var.d;
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
                    HashMap hashMap3 = x8Var.G[i10];
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
                x8 x8Var2 = this.b;
                x8Var2.n = false;
                if (tL_stories_allStories == null) {
                    x8Var2.q();
                    x8Var2.T();
                    break;
                } else {
                    x8Var2.Y(tL_stories_allStories, false, true, false);
                    x8Var2.Q(false);
                    x8Var2.Q(true);
                    break;
                }
        }
    }
}
