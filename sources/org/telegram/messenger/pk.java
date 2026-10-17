package org.telegram.messenger;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final /* synthetic */ class pk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;

    public /* synthetic */ pk(TopicsController topicsController, int i10) {
        this.a = i10;
        this.b = topicsController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$applyPinnedOrder$17();
                break;
            default:
                this.b.lambda$databaseCleared$25();
                break;
        }
    }
}
