package org.telegram.messenger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
