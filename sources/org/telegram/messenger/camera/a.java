package org.telegram.messenger.camera;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera2Session b;

    public /* synthetic */ a(Camera2Session camera2Session, int i10) {
        this.a = i10;
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
