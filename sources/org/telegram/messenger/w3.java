package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileUploadOperation b;

    public /* synthetic */ w3(FileUploadOperation fileUploadOperation, int i10) {
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
