package org.telegram.messenger;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoader b;
    public final /* synthetic */ String c;

    public /* synthetic */ z2(FileLoader fileLoader, String str, int i10) {
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
