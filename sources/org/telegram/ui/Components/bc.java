package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ib b;

    public /* synthetic */ bc(ib ibVar, int i3) {
        this.a = i3;
        this.b = ibVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performHapticFeedback(3, 2);
                break;
            default:
                this.b.performHapticFeedback(3, 2);
                break;
        }
    }
}
