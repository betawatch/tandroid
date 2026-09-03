package org.telegram.messenger;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class x5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ x5(MediaController mediaController, int i10) {
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
                this.b.lambda$setTextureView$15();
                break;
            case 3:
                this.b.lambda$toggleRecordingPause$29();
                break;
            case 4:
                this.b.lambda$toggleRecordingPause$30();
                break;
            case 5:
                this.b.lambda$stopRaiseToEarSensors$9();
                break;
            case 6:
                this.b.lambda$new$2();
                break;
            case 7:
                this.b.lambda$new$3();
                break;
            case 8:
                this.b.lambda$new$4();
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
