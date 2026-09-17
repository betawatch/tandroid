package org.telegram.messenger.camera;

import org.telegram.messenger.camera.Camera2Session;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
