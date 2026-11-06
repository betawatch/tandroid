package org.telegram.messenger.camera;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera2Session b;

    public /* synthetic */ a(Camera2Session camera2Session, int i7) {
        this.a = i7;
        this.b = camera2Session;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$0();
                break;
            default:
                this.b.lambda$checkOpen$2();
                break;
        }
    }
}
