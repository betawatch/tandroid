package org.telegram.messenger;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
