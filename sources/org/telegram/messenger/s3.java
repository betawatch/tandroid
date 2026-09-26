package org.telegram.messenger;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileUploadOperation b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ s3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.a = i10;
        this.b = fileUploadOperation;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startUploadRequest$5(this.c);
                break;
            default:
                this.b.lambda$startUploadRequest$9(this.c);
                break;
        }
    }
}
