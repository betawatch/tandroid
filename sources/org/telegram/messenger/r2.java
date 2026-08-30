package org.telegram.messenger;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;
    public final /* synthetic */ FileLoadOperationStream c;

    public /* synthetic */ r2(FileLoadOperation fileLoadOperation, FileLoadOperationStream fileLoadOperationStream, int i10) {
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
