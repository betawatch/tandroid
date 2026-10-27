package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileUploadOperation b;
    public final /* synthetic */ int[] c;

    public /* synthetic */ b4(FileUploadOperation fileUploadOperation, int[] iArr, int i10) {
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
