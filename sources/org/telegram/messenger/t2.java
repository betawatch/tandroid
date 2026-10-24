package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class t2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ t2(FileLoadOperation fileLoadOperation, boolean z10, int i10) {
        this.a = i10;
        this.b = fileLoadOperation;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$setIsPreloadVideoOperation$13(this.c);
                break;
            case 1:
                this.b.lambda$onFinishLoadingFile$18(this.c);
                break;
            case 2:
                this.b.lambda$onFinishLoadingFile$20(this.c);
                break;
            default:
                this.b.lambda$cancel$14(this.c);
                break;
        }
    }
}
