package org.telegram.messenger;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                this.b.lambda$clearOperation$27();
                break;
            case 1:
                this.b.lambda$onFinishLoadingFile$19();
                break;
            case 2:
                this.b.lambda$start$11();
                break;
            case 3:
                this.b.lambda$pause$8();
                break;
            case 4:
                this.b.lambda$cancelOnStage$15();
                break;
            case 5:
                this.b.lambda$new$0();
                break;
            default:
                this.b.lambda$new$7();
                break;
        }
    }
}
