package org.telegram.messenger.video;

import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
                ((y70) this.b).u();
                break;
            default:
                ((VideoFramesRewinder) this.b).lambda$new$2();
                break;
        }
    }
}
