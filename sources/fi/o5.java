package fi;

import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p6 b;

    public /* synthetic */ o5(p6 p6Var, int i7) {
        this.a = i7;
        this.b = p6Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                h6 h6Var = (h6) obj;
                p6 p6Var = this.b;
                HashMap hashMap = p6Var.H;
                int i7 = h6Var.e;
                int i10 = h6Var.f;
                long j3 = h6Var.d;
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
                    HashMap hashMap3 = p6Var.G[i7];
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
                p6 p6Var2 = this.b;
                p6Var2.n = false;
                if (tL_stories_allStories == null) {
                    p6Var2.q();
                    p6Var2.W();
                    break;
                } else {
                    p6Var2.b0(tL_stories_allStories, false, true, false);
                    p6Var2.T(false);
                    p6Var2.T(true);
                    break;
                }
        }
    }
}
