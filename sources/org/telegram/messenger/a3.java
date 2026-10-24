package org.telegram.messenger;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FileLoader b;
    public final /* synthetic */ String c;

    public /* synthetic */ a3(FileLoader fileLoader, String str, int i10) {
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
