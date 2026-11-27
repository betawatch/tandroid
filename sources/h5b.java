// default package

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
                v5b v5bVar = (v5b) obj;
                HashMap hashMap = c6bVar.H;
                byte b2 = v5bVar.e;
                int i = v5bVar.f;
                long j = v5bVar.d;
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
