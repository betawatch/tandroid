package org.telegram.messenger;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class q2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ FileLoadOperationStream c;

    public /* synthetic */ q2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
        this.a = i10;
        this.b = fileLoadOperation;
        this.c = fileLoadOperationStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$removeStreamListener$5(this.c);
                break;
            default:
                this.b.lambda$setStream$0(this.c);
                break;
        }
    }
}
