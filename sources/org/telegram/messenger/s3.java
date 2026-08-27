package org.telegram.messenger;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileUploadOperation b;

    public /* synthetic */ s3(FileUploadOperation fileUploadOperation, int i10) {
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
