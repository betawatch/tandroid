package org.telegram.messenger;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
