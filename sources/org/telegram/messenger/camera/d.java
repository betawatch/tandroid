package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera2Session.2 b;

    public /* synthetic */ d(Camera2Session.2 r12, int i7) {
        this.a = i7;
        this.b = r12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onConfigured$0();
                break;
            default:
                this.b.lambda$onConfigureFailed$1();
                break;
        }
    }
}
