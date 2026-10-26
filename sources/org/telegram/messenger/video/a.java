package org.telegram.messenger.video;

import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((OldVideoPlayerRewinder) this.b).lambda$incrementRewindCount$0();
                break;
            case 1:
                ((k80) this.b).u();
                break;
            default:
                ((VideoFramesRewinder) this.b).lambda$new$2();
                break;
        }
    }
}
