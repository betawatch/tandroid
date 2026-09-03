package oh;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ d7(g7 g7Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = g7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g7 g7Var = this.b;
                g7Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                g7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                g7 g7Var2 = this.b;
                g7Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i10 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        g7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                }
        }
    }
}
