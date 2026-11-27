// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class n6b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o6b b;
    public final /* synthetic */ TL_stories.PeerStories c;

    public /* synthetic */ n6b(o6b o6bVar, TL_stories.PeerStories peerStories, byte b) {
        this.a = b;
        this.b = o6bVar;
        this.c = peerStories;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_stories.PeerStories peerStories = this.c;
        o6b o6bVar = this.b;
        switch (b) {
            case 0:
                for (int i = 0; i < peerStories.stories.size(); i++) {
                    o6bVar.l(wf3.n(peerStories.peer), peerStories.stories.get(i));
                }
                break;
            default:
                o6bVar.g(wf3.n(peerStories.peer), peerStories);
                break;
        }
    }
}
