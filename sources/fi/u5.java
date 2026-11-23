package fi;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ u5(p6 p6Var, long j3, boolean z10, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.e = p6Var;
        this.c = j3;
        this.b = z10;
        this.f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p6 p6Var = (p6) this.e;
                long j3 = this.c;
                boolean z10 = this.b;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                long j10 = this.d;
                TLObject tLObject = (TLObject) this.h;
                p6Var.D.remove(Long.valueOf(j3));
                if (!z10) {
                    peerStories = p6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i7 = 0; i7 < tL_stories_stories.stories.size(); i7++) {
                            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                                if (peerStories.stories.get(i10).id == tL_stories_stories.stories.get(i7).id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i7));
                                    p6Var.Z(j10, tL_stories_stories.stories.get(i7));
                                }
                            }
                        }
                        if (!z10) {
                            c7 c7Var = p6Var.k;
                            c7Var.b.a.c(new a7(c7Var, peerStories, 0));
                        }
                    }
                    ks.f(p6Var.a).k(ks.y5, new Object[0]);
                    break;
                }
                break;
            default:
                org.telegram.messenger.w7 w7Var = (org.telegram.messenger.w7) this.e;
                boolean z11 = this.b;
                String str = (String) this.f;
                long j11 = this.c;
                long j12 = this.d;
                Float f10 = (Float) this.h;
                org.telegram.messenger.x8 x8Var = z11 ? (org.telegram.messenger.x8) w7Var.n.get(str) : (org.telegram.messenger.x8) w7Var.h.get(str);
                if (x8Var != null) {
                    Utilities.d.c(new org.telegram.messenger.s8(x8Var, f10, j12, j11));
                    break;
                } else if (j12 != 0) {
                    w7Var.y.put(str, Long.valueOf(j12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ u5(org.telegram.messenger.w7 w7Var, boolean z10, String str, long j3, long j10, Float f10) {
        this.e = w7Var;
        this.b = z10;
        this.f = str;
        this.c = j3;
        this.d = j10;
        this.h = f10;
    }
}
