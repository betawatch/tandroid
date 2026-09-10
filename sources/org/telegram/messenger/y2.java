package org.telegram.messenger;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoader b;

    public /* synthetic */ y2(FileLoader fileLoader, int i10) {
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
