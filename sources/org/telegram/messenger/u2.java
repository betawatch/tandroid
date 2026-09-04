package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
