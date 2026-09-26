package org.telegram.messenger;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
