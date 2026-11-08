package di;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ j7(l7 l7Var, TL_stories.PeerStories peerStories, int i7) {
        this.a = i7;
        this.b = l7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l7 l7Var = this.b;
                l7Var.getClass();
                int i7 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.c;
                    if (i7 >= peerStories.stories.size()) {
                        break;
                    } else {
                        l7Var.l(org.telegram.messenger.m5.o(peerStories.peer), peerStories.stories.get(i7));
                        i7++;
                    }
                }
            default:
                l7 l7Var2 = this.b;
                l7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.c;
                l7Var2.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                break;
        }
    }
}
