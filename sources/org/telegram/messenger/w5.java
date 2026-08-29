package org.telegram.messenger;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class w5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ w5(MediaController mediaController, int i10) {
        this.a = i10;
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
