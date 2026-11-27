// default package

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5b implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c6b b;

    public /* synthetic */ h5b(c6b c6bVar, byte b) {
        this.a = b;
        this.b = c6bVar;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        c6b c6bVar = this.b;
        switch (b) {
            case 0:
                u5b u5bVar = (u5b) obj;
                HashMap hashMap = c6bVar.H;
                byte b2 = u5bVar.e;
                int i = u5bVar.f;
                long j = u5bVar.d;
                if (b2 == 0 && i > 0) {
                    HashMap hashMap2 = (HashMap) hashMap.get(Long.valueOf(j));
                    if (hashMap2 != null) {
                        hashMap2.remove(Integer.valueOf(i));
                        if (hashMap2.isEmpty()) {
                            hashMap.remove(Long.valueOf(j));
                            break;
                        }
                    }
                } else {
                    HashMap hashMap3 = c6bVar.G[b2];
                    if (hashMap3 != null) {
                        hashMap3.remove(Long.valueOf(j));
                        break;
                    }
                }
                break;
            case 1:
                c6bVar.f = (LongSparseIntArray) obj;
                break;
            default:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                c6bVar.n = false;
                if (tL_stories_allStories == null) {
                    c6bVar.p();
                    c6bVar.V();
                    break;
                } else {
                    c6bVar.a0(tL_stories_allStories, false, true, false);
                    c6bVar.S(false);
                    c6bVar.S(true);
                    break;
                }
        }
    }
}
