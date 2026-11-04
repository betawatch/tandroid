package ei;

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y5 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z6 b;

    public /* synthetic */ y5(z6 z6Var, int i3) {
        this.a = i3;
        this.b = z6Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                r6 r6Var = (r6) obj;
                z6 z6Var = this.b;
                HashMap hashMap = z6Var.H;
                int i3 = r6Var.e;
                int i10 = r6Var.f;
                long j10 = r6Var.d;
                if (i3 == 0 && i10 > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j10));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i10));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j10));
                            break;
                        }
                    }
                } else {
                    HashMap hashMap3 = z6Var.G[i3];
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
