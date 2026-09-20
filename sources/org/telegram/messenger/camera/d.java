package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
