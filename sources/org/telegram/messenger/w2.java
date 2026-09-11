package org.telegram.messenger;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoader b;
    public final /* synthetic */ String c;

    public /* synthetic */ w2(FileLoader fileLoader, String str, int i10) {
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
