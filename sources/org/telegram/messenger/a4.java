package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class a4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileUploadOperation b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ a4(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
        this.a = i10;
        this.b = fileUploadOperation;
        this.c = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$startUploadRequest$9(this.c);
                break;
            default:
                this.b.lambda$startUploadRequest$5(this.c);
                break;
        }
    }
}
