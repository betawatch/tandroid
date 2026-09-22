package org.telegram.messenger;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoadOperation b;

    public /* synthetic */ o2(FileLoadOperation fileLoadOperation, int i10) {
        this.a = i10;
        this.b = fileLoadOperation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$clearOperation$26();
                break;
            case 1:
                this.b.lambda$start$10();
                break;
            case 2:
                this.b.lambda$pause$7();
                break;
            case 3:
                this.b.lambda$onFinishLoadingFile$18();
                break;
            case 4:
                this.b.lambda$cancelOnStage$14();
                break;
            default:
                this.b.lambda$new$6();
                break;
        }
    }
}
