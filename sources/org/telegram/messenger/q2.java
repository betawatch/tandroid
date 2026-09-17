package org.telegram.messenger;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
