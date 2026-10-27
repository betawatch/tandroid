package di;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ s7(u7 u7Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = u7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u7 u7Var = this.b;
                u7Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                u7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                u7 u7Var2 = this.b;
                u7Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i10 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        u7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                }
        }
    }
}
