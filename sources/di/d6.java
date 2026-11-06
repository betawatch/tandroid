package di;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ d6(y6 y6Var, long j3, boolean z9, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.e = y6Var;
        this.c = j3;
        this.b = z9;
        this.f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y6 y6Var = (y6) this.e;
                long j3 = this.c;
                boolean z9 = this.b;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                long j10 = this.d;
                TLObject tLObject = (TLObject) this.h;
                y6Var.D.remove(Long.valueOf(j3));
                if (!z9) {
                    peerStories = y6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i7 = 0; i7 < tL_stories_stories.stories.size(); i7++) {
                            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                                if (peerStories.stories.get(i10).id == tL_stories_stories.stories.get(i7).id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i7));
                                    y6Var.Z(j10, tL_stories_stories.stories.get(i7));
                                }
                            }
                        }
                        if (!z9) {
                            l7 l7Var = y6Var.k;
                            l7Var.b.a.c(new j7(l7Var, peerStories, 0));
                        }
                    }
                    qs.f(y6Var.a).k(qs.v5, new Object[0]);
                    break;
                }
                break;
            default:
                org.telegram.messenger.w7 w7Var = (org.telegram.messenger.w7) this.e;
                boolean z10 = this.b;
                String str = (String) this.f;
                long j11 = this.c;
                long j12 = this.d;
                Float f10 = (Float) this.h;
                org.telegram.messenger.y8 y8Var = z10 ? (org.telegram.messenger.y8) w7Var.n.get(str) : (org.telegram.messenger.y8) w7Var.h.get(str);
                if (y8Var != null) {
                    Utilities.d.c(new org.telegram.messenger.t8(y8Var, f10, j12, j11));
                    break;
                } else if (j12 != 0) {
                    w7Var.y.put(str, Long.valueOf(j12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d6(org.telegram.messenger.w7 w7Var, boolean z9, String str, long j3, long j10, Float f10) {
        this.e = w7Var;
        this.b = z9;
        this.f = str;
        this.c = j3;
        this.d = j10;
        this.h = f10;
    }
}
