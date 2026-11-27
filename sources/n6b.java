// default package

import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
