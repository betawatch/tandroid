package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ u5(MediaController mediaController, int i9) {
        this.a = i9;
        this.b = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startRaiseToEarSensors$8();
                break;
            case 1:
                this.b.lambda$playMessage$20();
                break;
            case 2:
                this.b.lambda$toggleRecordingPause$29();
                break;
            case 3:
                this.b.lambda$toggleRecordingPause$30();
                break;
            case 4:
                this.b.lambda$stopRaiseToEarSensors$9();
                break;
            case 5:
                this.b.lambda$new$2();
                break;
            case 6:
                this.b.lambda$new$3();
                break;
            case 7:
                this.b.lambda$new$4();
                break;
            case 8:
                this.b.lambda$setTextureView$15();
                break;
            case 9:
                this.b.lambda$toggleRecordingPause$31();
                break;
            default:
                this.b.lambda$setCurrentVideoVisible$14();
                break;
        }
    }
}
