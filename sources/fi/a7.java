package fi;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class a7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ a7(c7 c7Var, TL_stories.PeerStories peerStories, int i7) {
        this.a = i7;
        this.b = c7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c7 c7Var = this.b;
                c7Var.getClass();
                int i7 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.c;
                    if (i7 >= peerStories.stories.size()) {
                        break;
                    } else {
                        c7Var.l(org.telegram.messenger.n5.o(peerStories.peer), peerStories.stories.get(i7));
                        i7++;
                    }
                }
            default:
                c7 c7Var2 = this.b;
                c7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.c;
                c7Var2.g(org.telegram.messenger.n5.o(peerStories2.peer), peerStories2);
                break;
        }
    }
}
