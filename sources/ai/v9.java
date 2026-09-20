package ai;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class v9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ v9(y9 y9Var, TL_stories.PeerStories peerStories, int i10) {
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
