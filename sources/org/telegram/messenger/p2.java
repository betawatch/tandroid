package org.telegram.messenger;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ int c;

    public /* synthetic */ p2(FileLoadOperation fileLoadOperation, int i10, int i11) {
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
