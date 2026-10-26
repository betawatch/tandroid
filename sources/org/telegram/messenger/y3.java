package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class y3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileUploadOperation b;

    public /* synthetic */ y3(FileUploadOperation fileUploadOperation, int i10) {
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
