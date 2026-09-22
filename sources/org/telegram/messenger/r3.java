package org.telegram.messenger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileUploadOperation b;

    public /* synthetic */ r3(FileUploadOperation fileUploadOperation, int i10) {
        this.a = i10;
        this.b = fileUploadOperation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$start$0();
                break;
            case 1:
                this.b.lambda$cancel$3();
                break;
            case 2:
                this.b.lambda$startUploadRequest$7();
                break;
            default:
                this.b.lambda$onNetworkChanged$2();
                break;
        }
    }
}
