package org.telegram.messenger;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
