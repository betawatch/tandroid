package ih;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ a6(v6 v6Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = v6Var;
        this.c = j10;
        this.b = z10;
        this.f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v6 v6Var = (v6) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                TLObject tLObject = (TLObject) this.h;
                v6Var.D.remove(Long.valueOf(this.c));
                boolean z10 = this.b;
                long j10 = this.d;
                if (!z10) {
                    peerStories = v6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i9 = 0; i9 < tL_stories_stories.stories.size(); i9++) {
                            for (int i10 = 0; i10 < peerStories.stories.size(); i10++) {
                                if (peerStories.stories.get(i10).id == tL_stories_stories.stories.get(i9).id) {
                                    peerStories.stories.set(i10, tL_stories_stories.stories.get(i9));
                                    v6Var.W(j10, tL_stories_stories.stories.get(i9));
                                }
                            }
                        }
                        if (!z10) {
                            i7 i7Var = v6Var.k;
                            i7Var.b.getStorageQueue().postRunnable(new f7(i7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(v6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.b, (String) this.f, this.c, this.d, (Float) this.h);
                break;
        }
    }

    public /* synthetic */ a6(FileLoader fileLoader, boolean z10, String str, long j10, long j11, Float f10) {
        this.e = fileLoader;
        this.b = z10;
        this.f = str;
        this.c = j10;
        this.d = j11;
        this.h = f10;
    }
}
