package bi;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ i9(k9 k9Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = k9Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k9 k9Var = this.b;
                k9Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                k9Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                k9 k9Var2 = this.b;
                k9Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i10 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        k9Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                }
        }
    }
}
