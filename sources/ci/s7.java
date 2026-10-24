package ci;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ s7(v7 v7Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = v7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v7 v7Var = this.b;
                v7Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                v7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                v7 v7Var2 = this.b;
                v7Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i10 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        v7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                }
        }
    }
}
