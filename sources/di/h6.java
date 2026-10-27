package di;

import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h7 b;

    public /* synthetic */ h6(h7 h7Var, int i10) {
        this.a = i10;
        this.b = h7Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                z6 z6Var = (z6) obj;
                h7 h7Var = this.b;
                HashMap hashMap = h7Var.H;
                int i10 = z6Var.e;
                int i11 = z6Var.f;
                long j10 = z6Var.d;
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
                    HashMap hashMap3 = h7Var.G[i10];
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
                h7 h7Var2 = this.b;
                h7Var2.n = false;
                if (tL_stories_allStories == null) {
                    h7Var2.q();
                    h7Var2.W();
                    break;
                } else {
                    h7Var2.b0(tL_stories_allStories, false, true, false);
                    h7Var2.T(false);
                    h7Var2.T(true);
                    break;
                }
        }
    }
}
