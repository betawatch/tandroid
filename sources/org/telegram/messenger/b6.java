package org.telegram.messenger;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class b6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ b6(MediaController mediaController, int i10) {
        this.a = i10;
        this.b = mediaController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$toggleRecordingPause$30();
                break;
            case 1:
                this.b.lambda$toggleRecordingPause$31();
                break;
            case 2:
                this.b.lambda$toggleRecordingPause$32();
                break;
            case 3:
                this.b.lambda$playMessage$20();
                break;
            case 4:
                this.b.lambda$setTextureView$15();
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
                this.b.lambda$setCurrentVideoVisible$14();
                break;
            default:
                this.b.lambda$startRaiseToEarSensors$8();
                break;
        }
    }
}
