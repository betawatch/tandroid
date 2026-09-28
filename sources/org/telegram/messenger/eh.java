package org.telegram.messenger;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final /* synthetic */ class eh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ eh(NotificationsController notificationsController, long j3, int i10, int i11) {
        this.a = i11;
        this.b = notificationsController;
        this.c = j3;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$processDeleteStory$15(this.c, this.d);
                break;
            default:
                this.b.lambda$processReadStories$16(this.c, this.d);
                break;
        }
    }
}
