package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera2Session.2 b;

    public /* synthetic */ d(Camera2Session.2 r12, int i10) {
        this.a = i10;
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
