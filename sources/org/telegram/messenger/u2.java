package org.telegram.messenger;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoader b;

    public /* synthetic */ u2(FileLoader fileLoader, int i10) {
        this.a = i10;
        this.b = fileLoader;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$new$18();
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
