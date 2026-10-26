package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ int c;

    public /* synthetic */ r2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.a = i11;
        this.b = fileLoadOperation;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onFail$24(this.c);
                break;
            case 1:
                this.b.lambda$processRequestResult$23(this.c);
                break;
            case 2:
                this.b.lambda$start$9(this.c);
                break;
            default:
                this.b.lambda$startDownloadRequest$31(this.c);
                break;
        }
    }
}
