package org.telegram.messenger;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ s(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
        this.a = i12;
        this.b = accountInstance;
        this.c = j10;
        this.d = i10;
        this.e = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AutoMessageHeardReceiver.lambda$onReceive$1((AccountInstance) this.b, this.c, this.d, this.e);
                break;
            case 1:
                AutoMessageHeardReceiver.lambda$onReceive$3((AccountInstance) this.b, this.c, this.d, this.e);
                break;
            default:
                ((MediaController) this.b).lambda$startRecordingV2$23(this.d, this.c, this.e);
                break;
        }
    }

    public /* synthetic */ s(MediaController mediaController, int i10, long j10, int i11) {
        this.a = 2;
        this.b = mediaController;
        this.d = i10;
        this.c = j10;
        this.e = i11;
    }
}
