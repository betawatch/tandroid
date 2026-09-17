package org.telegram.messenger;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
