package ei;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ k7(m7 m7Var, TL_stories.PeerStories peerStories, int i3) {
        this.a = i3;
        this.b = m7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m7 m7Var = this.b;
                m7Var.getClass();
                int i3 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.c;
                    if (i3 >= peerStories.stories.size()) {
                        break;
                    } else {
                        m7Var.l(org.telegram.messenger.m5.o(peerStories.peer), peerStories.stories.get(i3));
                        i3++;
                    }
                }
            default:
                m7 m7Var2 = this.b;
                m7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.c;
                m7Var2.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                break;
        }
    }
}
