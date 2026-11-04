package org.telegram.messenger.video;

import org.telegram.ui.Components.f60;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((OldVideoPlayerRewinder) this.b).lambda$incrementRewindCount$0();
                break;
            case 1:
                ((f60) this.b).u();
                break;
            default:
                ((VideoFramesRewinder) this.b).lambda$new$2();
                break;
        }
    }
}
