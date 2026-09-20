package org.telegram.messenger;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
