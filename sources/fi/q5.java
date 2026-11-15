package fi;

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q5 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s6 b;

    public /* synthetic */ q5(s6 s6Var, int i7) {
        this.a = i7;
        this.b = s6Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                k6 k6Var = (k6) obj;
                s6 s6Var = this.b;
                HashMap hashMap = s6Var.H;
                int i7 = k6Var.e;
                int i10 = k6Var.f;
                long j3 = k6Var.d;
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
                    HashMap hashMap3 = s6Var.G[i7];
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
                s6 s6Var2 = this.b;
                s6Var2.n = false;
                if (tL_stories_allStories == null) {
                    s6Var2.q();
                    s6Var2.W();
                    break;
                } else {
                    s6Var2.b0(tL_stories_allStories, false, true, false);
                    s6Var2.T(false);
                    s6Var2.T(true);
                    break;
                }
        }
    }
}
