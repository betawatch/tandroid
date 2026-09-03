package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class wk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;

    public /* synthetic */ wk(TopicsController topicsController, int i10) {
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
