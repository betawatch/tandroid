package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class f3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ f3(FileLoader fileLoader, boolean z10, String str, long j3, long j10, Float f7) {
        this.e = fileLoader;
        this.c = z10;
        this.f = str;
        this.b = j3;
        this.d = j10;
        this.h = f7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((FileLoader) this.e).lambda$checkUploadNewDataAvailable$3(this.c, (String) this.f, this.b, this.d, (Float) this.h);
                break;
            default:
                zh.i5 i5Var = (zh.i5) this.e;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.f;
                TLObject tLObject = (TLObject) this.h;
                i5Var.D.remove(Long.valueOf(this.b));
                boolean z10 = this.c;
                long j3 = this.d;
                if (!z10) {
                    peerStories = i5Var.y(j3);
                }
                if (peerStories != null) {
                    if (tLObject instanceof TL_stories.TL_stories_stories) {
                        TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                        for (int i10 = 0; i10 < tL_stories_stories.stories.size(); i10++) {
                            for (int i11 = 0; i11 < peerStories.stories.size(); i11++) {
                                if (peerStories.stories.get(i11).id == tL_stories_stories.stories.get(i10).id) {
                                    peerStories.stories.set(i11, tL_stories_stories.stories.get(i10));
                                    i5Var.W(j3, tL_stories_stories.stories.get(i10));
                                }
                            }
                        }
                        if (!z10) {
                            zh.v5 v5Var = i5Var.k;
                            v5Var.b.getStorageQueue().postRunnable(new zh.t5(v5Var, peerStories, 1));
                        }
                    }
                    NotificationCenter.getInstance(i5Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f3(zh.i5 i5Var, long j3, boolean z10, TL_stories.PeerStories peerStories, long j10, TLObject tLObject) {
        this.e = i5Var;
        this.b = j3;
        this.c = z10;
        this.f = peerStories;
        this.d = j10;
        this.h = tLObject;
    }
}
