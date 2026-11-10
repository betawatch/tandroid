package di;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ k7(m7 m7Var, TL_stories.PeerStories peerStories, int i7) {
        this.a = i7;
        this.b = m7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m7 m7Var = this.b;
                m7Var.getClass();
                int i7 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.c;
                    if (i7 >= peerStories.stories.size()) {
                        break;
                    } else {
                        m7Var.l(org.telegram.messenger.m5.o(peerStories.peer), peerStories.stories.get(i7));
                        i7++;
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
