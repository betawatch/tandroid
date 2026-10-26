package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoader b;

    public /* synthetic */ z2(FileLoader fileLoader, int i10) {
        this.a = i10;
        this.b = fileLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$20();
                break;
            case 1:
                this.b.lambda$cancelLoadFile$8();
                break;
            default:
                this.b.lambda$cancel$10();
                break;
        }
    }
}
