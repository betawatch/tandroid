package ai;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final /* synthetic */ class w9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ w9(y9 y9Var, TL_stories.PeerStories peerStories, int i10) {
        this.a = i10;
        this.b = y9Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y9 y9Var = this.b;
                y9Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                y9Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                y9 y9Var2 = this.b;
                y9Var2.getClass();
                int i10 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i10 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        y9Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i10));
                        i10++;
                    }
                }
        }
    }
}
