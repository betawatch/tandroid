package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ v(AccountInstance accountInstance, long j10, int i10, int i11, int i12) {
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

    public /* synthetic */ v(MediaController mediaController, int i10, long j10, int i11) {
        this.a = 2;
        this.b = mediaController;
        this.d = i10;
        this.c = j10;
        this.e = i11;
    }
}
