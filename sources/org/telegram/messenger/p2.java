package org.telegram.messenger;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ p2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.a = i10;
        this.b = fileLoadOperation;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setIsPreloadVideoOperation$12(this.c);
                break;
            case 1:
                this.b.lambda$cancel$13(this.c);
                break;
            case 2:
                this.b.lambda$onFinishLoadingFile$17(this.c);
                break;
            default:
                this.b.lambda$onFinishLoadingFile$19(this.c);
                break;
        }
    }
}
