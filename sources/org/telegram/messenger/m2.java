package org.telegram.messenger;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ int c;

    public /* synthetic */ m2(FileLoadOperation fileLoadOperation, int i10, int i11) {
        this.a = i11;
        this.b = fileLoadOperation;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$onFail$23(this.c);
                break;
            case 1:
                this.b.lambda$processRequestResult$22(this.c);
                break;
            case 2:
                this.b.lambda$start$8(this.c);
                break;
            default:
                this.b.lambda$startDownloadRequest$30(this.c);
                break;
        }
    }
}
