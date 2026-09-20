package org.telegram.messenger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class fh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationsController b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ fh(NotificationsController notificationsController, long j3, int i10, int i11) {
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
