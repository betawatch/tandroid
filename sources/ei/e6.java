package ei;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.hs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ e6(z6 z6Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = z6Var;
        this.c = j10;
        this.b = z10;
        this.f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z6 z6Var = (z6) this.e;
                long j10 = this.c;
                boolean z10 = this.b;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                long j11 = this.d;
                TLObject tLObject = (TLObject) this.h;
                z6Var.D.remove(Long.valueOf(j10));
                if (!z10) {
                    peerStories = z6Var.y(j11);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i3 = 0; i3 < tL_stories_stories.stories.size(); i3++) {
                            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                                if (peerStories.stories.get(i10).id == tL_stories_stories.stories.get(i3).id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i3));
                                    z6Var.Z(j11, tL_stories_stories.stories.get(i3));
                                }
                            }
                        }
                        if (!z10) {
                            m7 m7Var = z6Var.k;
                            m7Var.b.a.c(new k7(m7Var, peerStories, 0));
                        }
                    }
                    hs.f(z6Var.a).k(hs.v5, new Object[0]);
                    break;
                }
                break;
            default:
                org.telegram.messenger.w7 w7Var = (org.telegram.messenger.w7) this.e;
                boolean z11 = this.b;
                String str = (String) this.f;
                long j12 = this.c;
                long j13 = this.d;
                Float f10 = (Float) this.h;
                org.telegram.messenger.y8 y8Var = z11 ? (org.telegram.messenger.y8) w7Var.n.get(str) : (org.telegram.messenger.y8) w7Var.h.get(str);
                if (y8Var != null) {
                    Utilities.d.c(new org.telegram.messenger.t8(y8Var, f10, j13, j12));
                    break;
                } else if (j13 != 0) {
                    w7Var.y.put(str, Long.valueOf(j13));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ e6(org.telegram.messenger.w7 w7Var, boolean z10, String str, long j10, long j11, Float f10) {
        this.e = w7Var;
        this.b = z10;
        this.f = str;
        this.c = j10;
        this.d = j11;
        this.h = f10;
    }
}
