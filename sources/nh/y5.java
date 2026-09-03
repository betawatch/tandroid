package nh;

import org.telegram.messenger.FileLoader;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y5 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ y5(t6 t6Var, long j10, boolean z4, TL_stories.PeerStories peerStories, long j11, TLObject tLObject) {
        this.e = t6Var;
        this.c = j10;
        this.b = z4;
        this.f = peerStories;
        this.d = j11;
        this.h = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t6 t6Var = (t6) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                TLObject tLObject = (TLObject) this.h;
                t6Var.D.remove(Long.valueOf(this.c));
                boolean z4 = this.b;
                long j10 = this.d;
                if (!z4) {
                    peerStories = t6Var.y(j10);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).id == tL_stories_stories.stories.get(i10).id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    t6Var.W(j10, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z4) {
                            g7 g7Var = t6Var.k;
                            g7Var.b.getStorageQueue().postRunnable(new d7(g7Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(t6Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            default:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.b, (String) this.f, this.c, this.d, (Float) this.h);
                break;
        }
    }

    public /* synthetic */ y5(FileLoader fileLoader, boolean z4, String str, long j10, long j11, Float f10) {
        this.e = fileLoader;
        this.b = z4;
        this.f = str;
        this.c = j10;
        this.d = j11;
        this.h = f10;
    }
}
