package ci;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ n6(h7 h7Var, long j10, boolean z10, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = h7Var;
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
                h7 h7Var = (h7) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                TLObject tLObject = (TLObject) this.h;
                h7Var.D.remove(Long.valueOf(this.c));
                boolean z10 = this.b;
                long j10 = this.d;
                if (!z10) {
                    peerStories = h7Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).id == tL_stories_stories.stories.get(i10).id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    h7Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            v7 v7Var = h7Var.k;
                            v7Var.b.getStorageQueue().postRunnable(new s7(v7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(h7Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.b, (String) this.f, this.c, this.d, (Float) this.h);
                break;
        }
    }

    public /* synthetic */ n6(FileLoader fileLoader, boolean z10, String str, long j10, long j11, Float f7) {
        this.e = fileLoader;
        this.b = z10;
        this.f = str;
        this.c = j10;
        this.d = j11;
        this.h = f7;
    }
}
