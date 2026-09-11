package bi;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
