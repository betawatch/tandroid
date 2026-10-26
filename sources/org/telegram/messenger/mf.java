package org.telegram.messenger;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class mf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesStorage b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ mf(MessagesStorage messagesStorage, boolean z10, int i10) {
        this.a = i10;
        this.b = messagesStorage;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.lambda$getCachedPhoneBook$153(this.c);
                break;
            default:
                this.b.lambda$cleanup$6(this.c);
                break;
        }
    }
}
