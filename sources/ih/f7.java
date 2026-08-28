package ih;

import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ f7(i7 i7Var, TL_stories.PeerStories peerStories, int i9) {
        this.a = i9;
        this.b = i7Var;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i7 i7Var = this.b;
                i7Var.getClass();
                TL_stories.PeerStories peerStories = this.c;
                i7Var.g(DialogObject.getPeerDialogId(peerStories.peer), peerStories);
                break;
            default:
                i7 i7Var2 = this.b;
                i7Var2.getClass();
                int i9 = 0;
                while (true) {
                    TL_stories.PeerStories peerStories2 = this.c;
                    if (i9 >= peerStories2.stories.size()) {
                        break;
                    } else {
                        i7Var2.l(DialogObject.getPeerDialogId(peerStories2.peer), peerStories2.stories.get(i9));
                        i9++;
                    }
                }
        }
    }
}
