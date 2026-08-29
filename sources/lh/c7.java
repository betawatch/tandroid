package lh;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ c7(f7 f7Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = f7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f7 f7Var = this.b;
                f7Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                f7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                f7 f7Var2 = this.b;
                f7Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i10 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        f7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                }
        }
    }
}
