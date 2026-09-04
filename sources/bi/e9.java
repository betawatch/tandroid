package bi;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class e9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ e9(h9 h9Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = h9Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h9 h9Var = this.b;
                h9Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                h9Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                h9 h9Var2 = this.b;
                h9Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i10 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        h9Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                }
        }
    }
}
