package fi;

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ d7(f7 f7Var, TL_stories.PeerStories peerStories, int i7) {
        this.a = i7;
        this.b = f7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f7 f7Var = this.b;
                f7Var.getClass();
                int i7 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories = this.c;
                    if (i7 >= peerStories.stories.size()) {
                        break;
                    } else {
                        f7Var.l(org.telegram.messenger.m5.o(peerStories.peer), peerStories.stories.get(i7));
                        i7++;
                    }
                }
            default:
                f7 f7Var2 = this.b;
                f7Var2.getClass();
                TL_stories.PeerStories peerStories2 = this.c;
                f7Var2.g(org.telegram.messenger.m5.o(peerStories2.peer), peerStories2);
                break;
        }
    }
}
