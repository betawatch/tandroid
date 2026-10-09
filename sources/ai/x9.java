package ai;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ x9(z9 z9Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = z9Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z9 z9Var = this.b;
                z9Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                z9Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                z9 z9Var2 = this.b;
                z9Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i10 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        z9Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                }
        }
    }
}
