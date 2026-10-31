package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class q7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ q7(b8 b8Var, boolean z10, String str, long j10, long j11, Float f7) {
        this.e = b8Var;
        this.c = z10;
        this.f = str;
        this.b = j10;
        this.d = j11;
        this.h = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b8 b8Var = (b8) this.e;
                boolean z10 = this.c;
                String str = (String) this.f;
                long j10 = this.b;
                long j11 = this.d;
                Float f7 = (Float) this.h;
                d9 d9Var = z10 ? (d9) b8Var.n.get(str) : (d9) b8Var.h.get(str);
                if (d9Var != null) {
                    Utilities.d.c(new y8(d9Var, f7, j11, j10));
                    break;
                } else if (j11 != 0) {
                    b8Var.y.put(str, Long.valueOf(j11));
                    break;
                }
                break;
            default:
                th.e5 e5Var = (th.e5) this.e;
                long j12 = this.b;
                boolean z11 = this.c;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                long j13 = this.d;
                TLObject tLObject = (TLObject) this.h;
                e5Var.D.remove(Long.valueOf(j12));
                if (!z11) {
                    peerStories = e5Var.y(j13);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).id == tL_stories_stories.stories.get(i10).id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    e5Var.Z(j13, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z11) {
                            th.r5 r5Var = e5Var.k;
                            r5Var.b.a.c(new th.q5(r5Var, peerStories, 0));
                        }
                    }
                    zs.f(e5Var.a).k(zs.v5, new Object[0]);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ q7(th.e5 e5Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = e5Var;
        this.b = j10;
        this.c = z10;
        this.f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }
}
