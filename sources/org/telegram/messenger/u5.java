package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class u5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaController b;

    public /* synthetic */ u5(MediaController mediaController, int i10) {
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
