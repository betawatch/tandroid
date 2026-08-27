package org.telegram.messenger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
