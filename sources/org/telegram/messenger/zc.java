package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class zc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Runnable[] c;

    public /* synthetic */ zc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.a = i10;
        this.b = zArr;
        this.c = runnableArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$466(this.b, this.c);
                break;
            default:
                PasskeysController.lambda$login$12(this.b, this.c);
                break;
        }
    }
}
