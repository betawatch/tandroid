package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb b;

    public /* synthetic */ wa(nb nbVar, int i10) {
        this.a = i10;
        this.b = nbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onExitTransitionStart();
                break;
            default:
                this.b.onEnterTransitionStart();
                break;
        }
    }
}
