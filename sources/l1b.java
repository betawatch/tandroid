// default package

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l1b implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g2b b;

    public /* synthetic */ l1b(g2b g2bVar, byte b) {
        this.a = b;
        this.b = g2bVar;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        g2b g2bVar = this.b;
        switch (b) {
            case 0:
                g2bVar.f = (LongSparseIntArray) obj;
                break;
            case 1:
                TL_stories.TL_stories_allStories tL_stories_allStories = (TL_stories.TL_stories_allStories) obj;
                g2bVar.n = false;
                if (tL_stories_allStories == null) {
                    g2bVar.p();
                    g2bVar.V();
                    break;
                } else {
                    g2bVar.a0(tL_stories_allStories, false, true, false);
                    g2bVar.S(false);
                    g2bVar.S(true);
                    break;
                }
            default:
                y1b y1bVar = (y1b) obj;
                HashMap hashMap = g2bVar.H;
                byte b2 = y1bVar.e;
                int i = y1bVar.f;
                long j = y1bVar.d;
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
                    HashMap hashMap3 = g2bVar.G[b2];
                    if (hashMap3 != null) {
                        hashMap3.remove(Long.valueOf(j));
                        break;
                    }
                }
                break;
        }
    }
}
