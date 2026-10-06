package org.telegram.messenger;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final /* synthetic */ class tk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TopicsController b;

    public /* synthetic */ tk(TopicsController topicsController, int i10) {
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
