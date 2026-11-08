package di;

import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6 b;

    public /* synthetic */ y5(y6 y6Var, int i7) {
        this.a = i7;
        this.b = y6Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                q6 q6Var = (q6) obj;
                y6 y6Var = this.b;
                HashMap hashMap = y6Var.H;
                int i7 = q6Var.e;
                int i10 = q6Var.f;
                long j3 = q6Var.d;
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
                    HashMap hashMap3 = y6Var.G[i7];
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
                y6 y6Var2 = this.b;
                y6Var2.n = false;
                if (tL_stories_allStories == null) {
                    y6Var2.q();
                    y6Var2.W();
                    break;
                } else {
                    y6Var2.b0(tL_stories_allStories, false, true, false);
                    y6Var2.T(false);
                    y6Var2.T(true);
                    break;
                }
        }
    }
}
