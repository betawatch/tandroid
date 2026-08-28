package org.telegram.messenger;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ int c;

    public /* synthetic */ m2(FileLoadOperation fileLoadOperation, int i9, int i10) {
        this.a = i10;
        this.b = fileLoadOperation;
        this.c = i9;
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
