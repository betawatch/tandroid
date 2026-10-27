package org.telegram.messenger;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoader b;
    public final /* synthetic */ String c;

    public /* synthetic */ b3(FileLoader fileLoader, String str, int i10) {
        this.a = i10;
        this.b = fileLoader;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$cancelLoadFile$7(this.c);
                break;
            case 1:
                this.b.lambda$cancel$9(this.c);
                break;
            default:
                this.b.lambda$cancelLoadAllFiles$12(this.c);
                break;
        }
    }
}
