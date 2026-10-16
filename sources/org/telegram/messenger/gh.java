package org.telegram.messenger;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ gh(NotificationsController notificationsController, long j10, int i10, int i11) {
        this.a = i11;
        this.b = notificationsController;
        this.c = j10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processDeleteStory$16(this.c, this.d);
                break;
            default:
                this.b.lambda$processReadStories$17(this.c, this.d);
                break;
        }
    }
}
