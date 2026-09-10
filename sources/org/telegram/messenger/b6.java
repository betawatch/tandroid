package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
