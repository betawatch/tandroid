package org.telegram.messenger;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ q2(FileLoadOperation fileLoadOperation, boolean z4, int i10) {
        this.a = i10;
        this.b = fileLoadOperation;
        this.c = z4;
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
