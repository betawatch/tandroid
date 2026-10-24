package org.telegram.messenger;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class h6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ h6(MediaController mediaController, int i10) {
        this.a = i10;
        this.b = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$playMessage$20();
                break;
            case 1:
                this.b.lambda$setTextureView$15();
                break;
            case 2:
                this.b.lambda$stopRaiseToEarSensors$9();
                break;
            case 3:
                this.b.lambda$toggleRecordingPause$31();
                break;
            case 4:
                this.b.lambda$toggleRecordingPause$32();
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
                this.b.lambda$setCurrentVideoVisible$14();
                break;
            case 9:
                this.b.lambda$toggleRecordingPause$33();
                break;
            default:
                this.b.lambda$startRaiseToEarSensors$8();
                break;
        }
    }
}
