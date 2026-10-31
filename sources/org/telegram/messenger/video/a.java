package org.telegram.messenger.video;

import org.telegram.ui.Components.z60;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                ((z60) this.b).u();
                break;
            default:
                ((VideoFramesRewinder) this.b).lambda$new$2();
                break;
        }
    }
}
