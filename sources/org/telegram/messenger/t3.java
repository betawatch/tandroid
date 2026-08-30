package org.telegram.messenger;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class t3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileUploadOperation b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ t3(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
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
