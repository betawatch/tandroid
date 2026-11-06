package org.telegram.messenger.video;

import org.telegram.ui.Components.k60;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((OldVideoPlayerRewinder) this.b).lambda$incrementRewindCount$0();
                break;
            case 1:
                ((k60) this.b).u();
                break;
            default:
                ((VideoFramesRewinder) this.b).lambda$new$2();
                break;
        }
    }
}
