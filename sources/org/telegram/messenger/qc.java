package org.telegram.messenger;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class qc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable[] c;

    public /* synthetic */ qc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = runnableArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.b, this.c);
                break;
            default:
                PasskeysController.lambda$login$12(this.b, this.c);
                break;
        }
    }
}
